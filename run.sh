#!/bin/bash

# accessibility check for java
if [[ $(java -version &> /dev/null && echo $?) != '0' ]]; then
  echo "You need installed java"
  exit 1
fi

# check Application.class file for start
if [[ ! -f Application.class ]]; then
  echo "You need to build program with build.sh script"
  exit 1
fi

java Application && echo "Results are available in output.txt file"
