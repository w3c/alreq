#Arabic Layout Requirements document#

Development version: http://w3c.github.io/alreq/

This document is being developed by the [Arabic Layout Task Force](http://www.w3.org/International/groups/arabic-layout/) and the [W3C Internationalization Working Group](http://www.w3.org/International/core/).

Feedback about the content of this document can be submitted via issues or pull request in this GitHub repo. 

If you prefer, you can also send comments to [public-i18n-arabic@w3.org](mailto:public-i18n-arabic-request@w3.org?subject=subscribe). You can also view the archives of this mailing list [here](http://lists.w3.org/Archives/Public/public-i18n-arabic/).

##Editorial guidelines:##

###Markup tips###

Ids should go on section elements, not `hx` elements.

```
<section id="h_my_heading">
<h2>My heading</h2>
```

Ids on `dfn` elements should start with `def_`.

Use the following markup for Unicode codepoint names:

```
<span class="uname">U+3002 IDEOGRAPHIC FULL STOP</span> [。]
```

For additional ideas about markup and styling in Internationalization Activity documents, especially wrt inline markup conventions, see
http://www.w3.org/International/docs/styleguide