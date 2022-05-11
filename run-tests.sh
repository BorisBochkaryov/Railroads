#!/bin/bash

echo "Test #1. Check data from the condition"
cp tests/input-1.txt input.txt
java Application
diff output.txt tests/output-1.txt &> /dev/null
if [[ "$?" == "0" ]]; then
  echo "Test #1 is done"
else
  echo "Test #1 is broken"
fi


echo "Test #2. Check error if file don't present"
rm input.txt
read MSG <<< $(java Application)
if [[ "$MSG" == "input.txt (No such file or directory)" ]]; then
  echo "Test #2 is done"
else
  echo "Test #2 is broken. Error message is not standard"
fi
# Restore default input.txt file
cp tests/input-1.txt input.txt

echo "Test #3. Check data with empty file"
cp tests/input-2.txt input.txt
java Application
diff output.txt tests/output-2.txt &> /dev/null
if [[ "$?" == "0" ]]; then
  echo "Test #3 is done"
else
  echo "Test #3 is broken"
fi
