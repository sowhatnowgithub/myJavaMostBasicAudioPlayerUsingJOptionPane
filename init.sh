#!/bin/bash
clear
echo "Audio Player"
./rename.sh
g++ outPut.cpp -o output
./output
grep ".mp3" "output.txt" > "output3.txt"
sed 's/mp3//g' output3.txt > output3_new.txt
rm output.txt output3.txt
python3 appender.py
rm output3_new.txt
read execs < execs.txt
./convert.sh $execs
rm execs.txt
./output
grep ".wav" "output.txt" > "output3.txt"
mv output3.txt output.txt
clear
python3 intro.py
java Main.java
rm outPut.txt
rm outPut1.txt
rm output
rm noOFmp3.txt
