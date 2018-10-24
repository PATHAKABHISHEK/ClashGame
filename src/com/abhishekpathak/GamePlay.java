package com.abhishekpathak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

public class GamePlay{

    // frame height and width
    private static final int HEIGHT_FRAME = 600;
    private static final int WIDTH_FRAME = 800;
    private Timer timer;
    private int delay  = 8;
    // components of the frame
    private JPanel startPanel;

    public GamePlay(){
        JFrame startFrame = new JFrame("Clash Game");
        startFrame.setResizable(false);
        startFrame.setVisible(true);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setSize(WIDTH_FRAME,HEIGHT_FRAME);
        startPanel.setLayout(new FlowLayout());
        startPanel.setBounds(0,0,WIDTH_FRAME, HEIGHT_FRAME);
        startFrame.add(startPanel);
    }


   public static void main(String[] args){

      GamePlay game = new GamePlay();




    }
}
