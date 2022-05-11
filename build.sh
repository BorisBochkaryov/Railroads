#!/bin/bash

# accessibility check for javac
if [[ $(javac -version &> /dev/null && echo $?) != '0' ]]; then
  echo "You need installed javac (JDK)"
  exit 1
fi

javac Application.java && echo "Source code was compiled! You can use run.sh for start this"
