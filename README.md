## Instructions
### if the instructions are not clear copy the following and paste it in chat gpt , it should ease the process
#### the below mentioned has to be done in the terminal for the folder to work

navigate to the main folder , containing these files , in the terminal

#### step 1: give executable permission for all the bash files


the terminal commands
```
chmod +x init.sh 
chmod +x convert.sh
chmod +x rename.sh
```

## with this the setup is complete


navigate to the main folder , containing these files , in the terminal
and enter
```
./init.sh

```
this should be working


## you can set it as environment variable byt following commands,

### there are many ways to achieve this but i find this most easy

\->navigate to your user bin (/usr/local/bin)  
```
cd /usr/local/bin
```
\->create a file called audioPlayer.sh  
\->open the file  
\->copy the next lines in the the file,  
```
path="" #in between the quotes write the file to the folder containing all the files of audioplayer,
cd $path
./init.sh
```
->after copying the text , save
->in terminal enter
```
chmod +x audioPlayer.sh
ln /usr/local/bin/audioPlayer.sh /usr/local/bin/audioplayer
```
->to verify whether the variable is created or not 
```
ls
```
->if you can see audioplayer, in the output, then success
->now anywhere in the terminal (i.e, folder), if you enter 
```
audioplayer
```
->The audioPlayer1.0 launches
->to quit the audioplayer , press ctrl-c in the terminal
