package com.abhishekpathak;

import javax.management.monitor.GaugeMonitor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel extends JPanel implements KeyListener{

    private int paddle_x = 600;
    private  int paddle_y = 500;

    private static final int PADDLE_WIDTH = 20;
    private static final int PADDLE_HEIGHT = 10;

    // Not required
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyReleased(KeyEvent e) {}
    // Not required part ended

    @Override
    public void keyPressed(KeyEvent e) {
    }
    public void paint(Graphics g){
        // panel is painted
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0, GamePlay.WIDTH_FRAME,GamePlay.HEIGHT_FRAME);
    }
}
