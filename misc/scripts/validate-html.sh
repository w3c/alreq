#!/usr/bin/env sh

html5validator index.html --ignore 'for attribute "lang" on element "td"'
html5validator gap-analysis/index.html
html5validator guidelines/index.html
html5validator homepage/index.html
html5validator charter/index.html
