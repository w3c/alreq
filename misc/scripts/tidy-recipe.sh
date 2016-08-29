#!/usr/bin/env sh

tidy -utf8 -w 80 --indent-attributes true --tidy-mark false --output-html true -i --new-blocklevel-tags section,figure,figcaption -m index.html
