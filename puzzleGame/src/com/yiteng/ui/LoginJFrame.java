package com.yiteng.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        //set the size of the window
        this.setTitle("Login");
        this.setSize(488,430);
        //set the window always on top
        this.setAlwaysOnTop(true);
        //set the window to the middle
        this.setLocationRelativeTo(null);
        //set game close method
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the window is visible
        this.setVisible(true);
    }
}
