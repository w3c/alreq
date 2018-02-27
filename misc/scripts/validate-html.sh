#!/usr/bin/env sh

# Ignore lang attribute for now because it doesn't understand `-t-` extensions.
# TODO: Remove this after the fix in html5validator is published.
html5validator index.html --ignore 'for attribute "lang" on element "td"'

html5validator gap-analysis/index.html
html5validator guidelines/index.html
html5validator homepage/index.html
html5validator charter/index.html
