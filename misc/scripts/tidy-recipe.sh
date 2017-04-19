#!/usr/bin/env sh

HTML_FILES='index.html'

tidy -utf8 \
  --break-before-br yes \
  --indent auto \
  --new-blocklevel-tags section,figure,figcaption \
  --output-html yes \
  --quiet yes \
  --tidy-mark no \
  --vertical-space yes \
  --wrap 100 \
  -m $HTML_FILES

