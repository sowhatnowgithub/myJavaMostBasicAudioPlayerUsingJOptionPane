import java.util.Scanner;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import javax.sound.sampled.*;
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String songPage="";
        int count=0;
        try (FileReader reader = new FileReader("outPut1.txt")) {
            int data = reader.read();
            while(data != -1){
                songPage = songPage+(char)data;
                data = reader.read();
                if((char)data=='\n'){
                    count=count+1;
                }
            }
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        JOptionPane.showMessageDialog(null,"Please Note Down The Song Number");
        String response="";
        String songName="";
        int songNumber=44;
        printgarbage(7);
        while(!response.equals("Q")){
            if(response.equals("W")){
                int randNum = random.nextInt(count);
                songNumber = randNum;
            }
            else if(response.equals("R")){
            }
            else{
                JOptionPane.showMessageDialog(null, songPage);
                songName = JOptionPane.showInputDialog("Enter Song Number");
                songNumber = Integer.parseInt(songName);
            }
            String path="";
        
        try (FileReader reader = new FileReader("outPut.txt")) {
            int data = reader.read();
            int count1 = 0;
            songName = "";
            while(data != -1){
                songName=songName+(char)data;
                if((char)data=='\n'){
                    count1=count1+1;
                    if(count1==songNumber){
                       break;
                    }
                    else{
                        songName="";
                    }
                }
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "yeah");
        String songPath = path+songName;
        System.out.println(songPath);
        songPath=songPath.trim();
        File songFile = new File(songPath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(songFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        response = JOptionPane.showInputDialog("NOW PLAYING: "+songName+"Press P=Play,S=stop,V=viewSonglist,R=reload,W=randomsongQ=Quit");
        response=response.toUpperCase();
        switch (response) {
            case ("P"):
                clip.start();
                break;
            case ("S"):
                clip.stop();
                printgarbage(2);
                response = JOptionPane.showInputDialog("NOW PLAYING: "+songName+"Press P=Play,S=stop,V=viewSonglist,Q=Quit");
                break;   
            case ("V"):
                System.out.println("Song Page Opening");
                printgarbage(3);
                clip.stop();
                break;
            case ("Q"):
                System.out.println("Quiting AudioPlayer.....");
                printgarbage(10);
                break;   
            case ("W"):
                System.out.println("yes reloading the song");
                printgarbage(4);
                clip.stop();
                break;
            case ("R"):
                clip.stop();
                printgarbage(5);
            default:
                System.out.println("Not valid Input");
                printgarbage(20);
        }
        if (clip != null) {
            clip.stop();
            clip.flush();
            clip.close();
        }
        if (audioStream != null) {
            try {
                audioStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
        JOptionPane.showMessageDialog(null,"Thanks For using AudioPlayer.1.0");
        input.close();
    }
    public static void printgarbage(int count){
        while(--count!=0){
            
            System.out.println("ladfjaldfjadfj;af fviaefnajfadfajfifkajdfoaiue^*^*^$*#*#$^@*^@&(@*&(()@&97^&(*#$R&&*(#&(R*#&(#*&*#*&))))))");
            System.out.println("https://fafdafdahdahfauho24352452625526526463736743");
            System.out.println("ultricies, eget efficitur ligula tristique. Donec vestibulum eros eu erat ultricies, et aliquet dui efficitur. Nam tempus quam quis orci venenatis, nec lacinia tortor dictum. Duis nec turpis eu arcu condimentum");
            System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ut ultricies libero. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Fusce auctor massa eget ");
            System.out.println("condimentum mattis. Vivamus vitae risus id est suscipit auctor. Sed vestibulum, elit ac faucibus lobortis, justo libero laoreet velit, in aliquam purus urna vel metus. Nullam sollicitudin luctus purus, nec vestibulum urna tincidunt sit amet. Maecenas quis purus libero.");
        }
    }

}