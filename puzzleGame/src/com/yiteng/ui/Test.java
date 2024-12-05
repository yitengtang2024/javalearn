package com.yiteng.ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        //the main window of the game
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603,680);
        gameJframe.setVisible(true);
        //the login window of the game
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);
        //register window
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);
    }


}
