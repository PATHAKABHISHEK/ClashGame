package com.abhishekpathak;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Panel extends JPanel implements KeyListener, ActionListener {

    private String score = "0";
    private int delay = 8;
    private boolean play = false;
    // paddle x and y positions
    private int paddle_x = 400;
    private int paddle_y = 520;


    // paddle width and height
    private static final int PADDLE_WIDTH = 110;
    private static final int PADDLE_HEIGHT = 12;

    // ball x and y positions

    private int ball_x = 100;
    private int ball_y = 250;

    private int ball_direction_x = 1;
    private int ball_direction_y = 1;
    // ball width and height

    private static final int BALL_HEIGHT = 15;
    private static final int BALL_WIDTH = 15;
    private Timer timer;

    // panel Constructor

    private Map map;
    Panel(){
        map = new Map(3,15);
        JLabel score = new JLabel("0");
        score.setForeground(Color.red);
        score.setFont(new Font("monospace",Font.BOLD, 20));
        score.setBounds(600,20,20,20);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();

    }


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
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if ((paddle_x + PADDLE_WIDTH +10) >= (GamePlay.WIDTH_FRAME)) {
                paddle_x = paddle_x;
            } else {
                paddle_x += 20;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (paddle_x < 10) {
                paddle_x = 10;
            } else {
                paddle_x -= 20;
            }
        }
        play = true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play){

            if((new Rectangle(ball_x,ball_y, BALL_WIDTH, BALL_HEIGHT).intersects(new Rectangle(paddle_x, paddle_y, PADDLE_WIDTH, PADDLE_HEIGHT)))){
                ball_direction_y = -ball_direction_y;
            }

            A:for(int i = 0; i <  map.map_array.length;i++){
                for(int j = 0; j < map.map_array[0].length; j++){
                    if(map.map_array[i][j] > 0){
                        int colliderheight = map.collider_height;
                        int colliderwidth = map.collider_width;
                        int colliderx = j*map.collider_width + 80;
                        int collidery = i*map.collider_height + 60;

                        if(new Rectangle(colliderx, collidery, colliderwidth, colliderheight).intersects(new Rectangle(ball_x, ball_y, BALL_WIDTH, BALL_HEIGHT))){
                            int int_score;
                            int_score = Integer.parseInt(score) + 1;
                            score = String.valueOf(int_score);
                            map.map_array[i][j] = 0;

                            if(ball_x + 19 <= colliderx || ball_x + 1 >= colliderx + colliderwidth){
                                ball_direction_x = - ball_direction_x;
                            }else{
                                ball_direction_y = - ball_direction_y;
                            }
                            break A;
                        }
                    }
                }
            }





            ball_x += ball_direction_x;
            ball_y += ball_direction_y;

            if (ball_x < 0) {
                ball_direction_x = -ball_direction_x;
            }
            if (ball_x + 20 > GamePlay.WIDTH_FRAME) {
                ball_direction_x = -ball_direction_x;
            }
            if (ball_y < 0) {
                ball_direction_y = -ball_direction_y;
            }
        }
        repaint();

    }

    // Implementation of method Ends


    public void paint(Graphics g){
        // panel is painted
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0, GamePlay.WIDTH_FRAME,GamePlay.HEIGHT_FRAME);

        map.draw((Graphics2D)g);

        // painting paddle
        g.setColor(Color.RED);
        g.fillRect(paddle_x,paddle_y,PADDLE_WIDTH,PADDLE_HEIGHT);

        // painting oval
        g.setColor(Color.WHITE);
        g.fillArc(ball_x,ball_y,BALL_WIDTH,BALL_HEIGHT,0,360);

        // paint score
        g.setColor(Color.ORANGE);
        g.setFont(new Font("monospace", Font.BOLD,30));
        g.drawString(score,700,50);

        g.dispose();

    }


    }



