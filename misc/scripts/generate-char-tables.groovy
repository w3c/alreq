@Grapes([
        @Grab(group='au.com.bytecode', module='opencsv', version='2.4'),
        @GrabConfig(systemClassLoader = true)
        ])

			
import au.com.bytecode.opencsv.CSVReader
import groovy.xml.MarkupBuilder

/*
 * @author shervinafshar, @date 02/21/2016
 */

tables = [['fname': 'resources/chars-alphabet.csv', 'name': 'Alphabetical characters'],
		  ['fname': 'resources/chars-diacritics.csv', 'name': 'Diacritics'],
		  ['fname': 'resources/chars-numbers.csv', 'name': 'Numeral characters'],
		  ['fname': 'resources/chars-punctuations.csv', 'name': 'Punctuations and symbols'],
		  ['fname': 'resources/chars-control.csv', 'name': 'Control characters']]

tables.each {
	List<String[]> lines = new CSVReader(new FileReader(it['fname']))
	.readAll()
	header = lines[0]
	cols = header.size()
	it['rows'] = []
	lines[1..lines.size()-1].findAll { row ->
		m = [:]
		i = 0
		header.each {
			m[it] = row[i]
			i++
				}
		it['rows'].add(m)
	}
}

File fOut = new File('chars-out.html')

StringWriter writer = new StringWriter()
MarkupBuilder markup = new MarkupBuilder(writer)
markup.setDoubleQuotes(true)

markup.section(class: 'appendix', id: "characters") {
    h2 'Characters'
	tables.each {
		h3 it['name']
		rows = it['rows']
		table(class: 'characters') {
			thead {
				tr {
					th ('Character')
					th ('UCS')
					th ('Name')
					th ('Ar')
					th ('Fa')
				}
			}
			tbody {
				rows.findAll
				{ row ->
					tr(id: "def_${row['UCS']}") {
						td (lang: 'ar', class: 'rtlTermCell', row['Character'])
						td (class: 'uname', row['UCS'])
						td (class: 'uname', row['Name'])
						td row['Ar']
						td row['Fa']
					}
				}
			}
		}
	}
}

fOut.withWriter('UTF-8') { it.write(writer.toString())}
