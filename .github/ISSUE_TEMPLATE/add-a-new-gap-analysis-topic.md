---
name: Add a new gap-analysis topic
about: Only those in the alreq group should use this template.
title: Brief_description_of_the_problem
labels: doc:arfa, gap
assignees: ''

---

<i class="meta">This issue is applicable to most_languages.</i>

Brief_intro_illustrating_the_requirements

More:
- [requirements_doc]()
- [etc]()


IF THIS IS NOT THE ISSUE THAT IS BEING TRACKED BY THE GAP-ANALYSIS PIPELINE, ADD A POINTER TO THAT ISSUE.  THE INITIAL BRIEF INTRO SHOULD REMAIN, AND MAY BE TAILORED WITH EXAMPLES RELEVANT TO THIS LANGUAGE.  YOU MAY, OPTIONALLY, ALSO ADD OTHER DETAILS BELOW IF THEY ARE SPECIFIC TO THIS LANGUAGE. THEN ADD THIS:

<b class="meta">For more details, see [this GitHub issue](https://github.com/w3c/XXXX/issues/XX), which is being used to track this gap. Please add any discussion there, and not to this issue.</b>

THEN ADD THESE 2 PARAS TO THE SECOND COMMENT FIELD AND DELETE THE REST OF THIS TEMPLATE.

_The first comment in this issue contains text that will automatically appear in one or more gap-analysis documents as a subsection with the same title as this issue. Any edits made to that comment will be immediately available in the Editor's draft of the document._

_**Please add any discussion to the GitHub issue being used to track this gap, and not to this issue**_





### The GAP

Description_of_the_problem_and_summary_of_test_results

Brief_description_of_what_spec_says_on_the_matter
[shortname](url_to_section) describe_what_it_says

<span class="pass">Gecko</span>, <span class="partial">Blink</span>, and <span class="fail">Webkit</span>

More:
- [relevant_issues]()
- [etc]()




### Priority
Why_you_chose_the_priority





### Tests & results

<i>Interactive test</i>, [assertion](url)<br>
<i>I18n test suite</i>, [section_head](url)

Summarise_the_results_for_each_major_engine_only_if_useful





### Action taken
<i>Issue</i>, [XXX](url) Closed.

[Gecko](url) • [Blink](url) • [Webkit](url)




### Outcomes
Brief_description_of_developments




TEXT FOR THE SECOND COMMENT FIELD: ADAPT THE LINKS AS NEEDED; IF THE DOCS SPAN REPOS, BOLD THE ONE THAT IS REFERRED TO FROM THE PIPELINE
_The first comment in this issue contains text that will automatically appear in one or more gap-analysis documents as a subsection with the same title as this issue. Any edits made to that comment will be immediately available in the Editor's draft of the document. Proposals for changes or discussion of the content can be made by adding comments below this point._

_Relevant gap analysis documents include:_
_[Adlam](https://www.w3.org/TR/adlm-gap#fragmentid) • [Arabic/Persian](https://www.w3.org/TR/alreq-gap#fragmentid) • [Bengali](https://www.w3.org/TR/beng-gap/#fragmentid) • [Cherokee](https://www.w3.org/TR/cher-gap#fragmentid) • [Chinese](https://www.w3.org/TR/clreq-gap#fragmentid) • [Dutch](https://www.w3.org/TR/latn-nl-gap#fragmentid) • [Ethiopic](https://www.w3.org/TR/elreq-gap#fragmentid) • [French](https://www.w3.org/TR/latn-fr-gap#fragmentid) • [**Georgian**](https://www.w3.org/TR/geor-gap#fragmentid) • [German](https://www.w3.org/TR/latn-de-gap#fragmentid) • [Greek](https://www.w3.org/TR/grek-gap#fragmentid) • [Gujarati](https://www.w3.org/TR/gujr-gap#fragmentid) • [Hebrew](https://www.w3.org/TR/hebr-gap#fragmentid) • [Hindi](https://www.w3.org/TR/deva-gap#fragmentid) • [Hungarian](https://w3c.github.io/eurlreq/gap-analysis/latn-nl-gap#fragmentid)  • [Inuktitut/Cree](https://www.w3.org/TR/cans-iu-cr-gap#fragmentid) • [Japanese](https://www.w3.org/TR/jpan-gap#fragmentid) • [Javanese](https://www.w3.org/TR/java-gap#fragmentid) • [Khmer](https://www.w3.org/TR/khmr-gap#fragmentid) • [Korean](https://www.w3.org/TR/kore-gap#fragmentid) • [Lao](https://www.w3.org/TR/laoo-gap#fragmentid) • [Mongolian](https://www.w3.org/TR/mong-gap#fragmentid) • [N'Ko](https://www.w3.org/TR/nkoo-gap#fragmentid) • [Osage](https://www.w3.org/TR/osge-osa-gap#fragmentid) • [Punjabi](https://www.w3.org/TR/guru-gap#fragmentid) • [Tamil](https://www.w3.org/TR/taml-gap#fragmentid) • [Thai](https://www.w3.org/TR/thai-gap#fragmentid) • [Tibetan](https://www.w3.org/TR/tibt-gap#fragmentid)_


SETTING LABELS (delete before submitting)
gap should already be assigned
doc:... should point to each document _in this repo_ where this gap report will appear
i:... should indicate the section in those documents where this will appear
x:blink/gecko/webkit should be set for browser engines that don't resolve the gap (and removed when they do)
x:... language or script related tags should be set for all affected languages
p:... should indicate the priority of this gap
