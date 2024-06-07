#!/bin/bash
echo "convering operation undergoing >>>>>>>>>>>>>>>>>>"

rm "$mp3File"
for i in $@
do 
    mp3File="${i}mp3"   
    echo "$mp3File"
    wavFile="${i}wav"
    ffmpeg -i $mp3File $wavFile
done
rm "$mp3File"