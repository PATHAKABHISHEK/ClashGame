package com.abhishekpathak;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Login{

    private int loginFrameDimensionx  = 400;
    private int loginFrameDimensiony =  200;
    JButton submit;
    JFrame clashGameLogin;
    JTextField nameField;
    JTextField ageField;
    Login() {
        clashGameLogin = new JFrame("Clash Game Login");
        clashGameLogin.setVisible(true);
        clashGameLogin.setResizable(false);
        clashGameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clashGameLogin.setSize(loginFrameDimensionx, loginFrameDimensiony);
        JPanel clashGameLoginPanel = new JPanel();
        clashGameLoginPanel.setBounds(0, 0, loginFrameDimensionx, loginFrameDimensiony);
        clashGameLoginPanel.setBackground(Color.WHITE);
        clashGameLogin.add(clashGameLoginPanel);
        clashGameLoginPanel.setLayout(new GridLayout(3,1));

        JPanel subPanel = new JPanel();
        subPanel.setLayout(new GridLayout(2,2));
        JLabel title = new JLabel("Enter Details");

        title.setFont(new Font("monospace", Font.BOLD, 20));
        JLabel name = new JLabel("Name : ");
        nameField = new JTextField();
        nameField.setColumns(15);
        JLabel age = new JLabel("Age : ");
        ageField = new JTextField();
        ageField.setColumns(15);
        submit = new JButton("GO");

        clashGameLoginPanel.add(title);
        clashGameLoginPanel.add(subPanel);
        clashGameLoginPanel.add(submit);




        subPanel.add(name);
        subPanel.add(nameField);
        subPanel.add(age);
        subPanel.add(ageField);

    }
    public static void main(String[] args){

        Login  loginPage = new Login();

        loginPage.submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(loginPage.nameField.getText() == null || loginPage.ageField.getText() == null) {

                    JOptionPane.showMessageDialog(loginPage.clashGameLogin,"Please Enter Name and Age Correctly !!");
                }else {
                    loginPage.clashGameLogin.setVisible(false);
                    GamePlay game = new GamePlay();
                    game.startFrame.setVisible(true);
                }
            }
        });






    }



}
