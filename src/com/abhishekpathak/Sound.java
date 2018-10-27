/*
package com.abhishekpathak;

import javax.sound.sampled.*;
import java.io.*;


public class Sound{



        // to store current position
        Long currentFrame;
        Clip clip;

        // current status of clip
        String status;

        AudioInputStream audioInputStream;
        static String filePath;

        // constructor to initialize streams and clip
        public Sound()
                throws UnsupportedAudioFileException,
                IOException, LineUnavailableException
        {
            // create AudioInputStream object
            audioInputStream =
                    AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

            // create clip reference
            clip = AudioSystem.getClip();

            // open audioInputStream to the clip
            clip.open(audioInputStream);

            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }

        public static void main(String[] args) {
            try {
                filePath = "Your path for the file";
                Sound audioPlayer = new Sound();
                audioPlayer.play();
            } catch (Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();

            }

        }
}*/
