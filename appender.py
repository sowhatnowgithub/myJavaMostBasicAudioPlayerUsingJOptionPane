execs = ""
count=0
with open("outPut3_new.txt","r") as file:
    for line in file:
        line = line.replace("\n","")
        execs = execs+line+" "
        count=count+1
with open("execs.txt","w") as newFile:
    newFile.write(execs)
with open("noOfmp3.txt","w") as countFile:
    countFile.write(str(count))