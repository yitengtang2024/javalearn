package com.yiteng.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame() {
        initJFrame();

        initImage();
    }
    //init the JFrame
    private void initJFrame() {
        //set the size of the window
        this.setTitle("Register");
        this.setSize(488,500);
        //set the window always on top
        this.setAlwaysOnTop(true);
        //set the window to the middle
        this.setLocationRelativeTo(null);
        //set game close method
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the window is visible
        this.setVisible(true);
    }

    //init the image of register page
    private void initImage() {

    }



}
