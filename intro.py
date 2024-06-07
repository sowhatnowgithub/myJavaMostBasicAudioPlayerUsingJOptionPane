for i in range(0,5):
    print("*")

print("welcome to audioPlayer")
with open("outPut.txt","r") as songfile:
    songFileSat=open("outPut1.txt","w")
    songFileSat.write("")
    with open("outPut1.txt","a") as songFileNew:
        i=1
        for line in songfile:
            songFileNew.write(str(i)+". "+line)
            i=i+1
            


