package com.abhishekpathak;

import javax.management.monitor.GaugeMonitor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel extends JPanel implements KeyListener, ActionListener {

    // paddle x and y positions
    private int paddle_x = 400;
    private int paddle_y = 520;

    // paddle width and height
    private static final int PADDLE_WIDTH = 150;
    private static final int PADDLE_HEIGHT = 18;

    // ball x and y positions

    private int ball_x = 40;
    private int ball_y = 100;

    // ball width and height

    private static final int BALL_HEIGHT = 20;
    private static final int BALL_WiDTH = 20;


    // All Implemented methods from different interface goes here
    // Implementation of method starts
    // Not required
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyReleased(KeyEvent e) {}
    // Not required part ended

    @Override
    public void keyPressed(KeyEvent e) {
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // Implementation of method Ends


    public void paint(Graphics g){
        // panel is painted
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0, GamePlay.WIDTH_FRAME,GamePlay.HEIGHT_FRAME);

        // painting paddle
        g.setColor(Color.RED);
        g.fillRect(paddle_x,paddle_y,PADDLE_WIDTH,PADDLE_HEIGHT);

        // painting oval
        g.setColor(Color.WHITE);
        g.fillArc(ball_x,ball_y,BALL_WiDTH,BALL_HEIGHT,0,360);

    }


}
