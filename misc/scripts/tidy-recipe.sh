#!/usr/bin/env sh

tidy -utf8 --wrap 0  --tidy-mark false --output-html true -i --new-blocklevel-tags section,figure,figcaption -m index.html
