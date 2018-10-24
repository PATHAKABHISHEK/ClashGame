package com.abhishekpathak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

public class GamePlay{

    // frame height and width
    static final int HEIGHT_FRAME = 600;
    static final int WIDTH_FRAME = 800;
    // components of the frame
    public GamePlay(){
        JFrame startFrame = new JFrame("Clash Game");
        Panel panel = new Panel();
        startFrame.setResizable(false);
        startFrame.setVisible(true);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setSize(WIDTH_FRAME,HEIGHT_FRAME);
        startFrame.add(panel);

    }



   public static void main(String[] args){

      GamePlay game = new GamePlay();




    }
}
