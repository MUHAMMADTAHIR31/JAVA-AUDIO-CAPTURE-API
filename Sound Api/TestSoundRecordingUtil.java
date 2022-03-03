import java.io.File;
import java.io.IOException;
 
import javax.sound.sampled.LineUnavailableException;

public class TestSoundRecordingUtil {
    private static final int RECORD_TIME = 60000;   // 60 seconds  
     
    public static void main(String[] args) {
        File wavFile = new File("D:\\javaprogram\\Networking\\Sound Api\\text.wav");
         
        final SoundRecordingUtil recorder = new SoundRecordingUtil();
         
        // create a separate thread for recording
        Thread recordThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Start recording...");
                    recorder.start();
                } catch (LineUnavailableException ex) {
                    ex.printStackTrace();
                    System.exit(-1);
                }              
            }
        });
         
        recordThread.start();
         
        try {
            Thread.sleep(RECORD_TIME);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
         
        try {
            recorder.stop();
            recorder.save(wavFile);
            System.out.println("STOPPED");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
        System.out.println("DONE");
    }
 
}