@Grapes([
        @Grab(group='au.com.bytecode', module='opencsv', version='2.4'),
        @Grab(group='com.h2database', module='h2', version='1.4.190'),
        @GrabConfig(systemClassLoader = true)
        ])

import groovy.sql.Sql
import com.h2database.*
import groovy.xml.MarkupBuilder

/*
 * @author shervinafshar, @date 02/21/2016
 */

// Tab-separated, column-names on first line should be uppercase
String fIn = 'resources/alreq-glossary.tsv'
File fOut = new File('out.html')

Sql db = Sql.newInstance("jdbc:h2:mem:db1", "org.h2.Driver")
db.execute("CREATE TABLE temp AS SELECT * FROM CSVREAD('" + fIn + "', null, 'charset=UTF-8 fieldSeparator=\t')")
String selectQuery = "SELECT * FROM temp WHERE PRIORITY IN (1, 2)"

StringWriter writer = new StringWriter()
MarkupBuilder markup = new MarkupBuilder(writer)
markup.setDoubleQuotes(true)

markup.html {
    body {
        section(class: 'appendix', id: "glossary") {
            h2 'Glossary'
                table(class: 'glossary') {
                    thead {
                        tr {
                            th ('Term')
                            th ('Arabic')
                            th ('Transliterated Arabic')
                            th ('Persian')
                            th ('Transliterated Persian')
                            th ('Definition')
                        }
                    }
                    tbody {
                        db.eachRow(selectQuery)
                                { row ->
                                    tr(id: "def_${row['TERMINOLOGY'].replaceAll(' ', '')}") {
                                        td row['TERMINOLOGY']
                                        td (lang: 'ar', dir:'rtl', row['ARABIC'])
                                        td (lang: 'ar-Latn-t-ar-m0-alaloc-2012', row['ARABIC TRANSLITERATION'])
                                        td (lang: 'fa', dir:'rtl', row['PERSIAN'] != null ? row['PERSIAN'] : '')
                                        td (lang: 'fa-Latn-t-fa-m0-ungen-2012', row['PERSIAN TRANSLITERATION'] != null ? row['PERSIAN TRANSLITERATION'] : '')
                                        td row['DEFINITION'] != null ? row['DEFINITION'] : ''
                                    }
                                }
                    }
                }
            }
        }
}

fOut.withWriter('UTF-8') { it.write(writer.toString().replace("\n", "\n\n"))}