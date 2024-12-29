package com.yiteng.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3() {
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);

        this.addKeyListener(this);
        this.setVisible(true);

    }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("KeyTyped");


    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("KeyPressed");
        int code = e.getKeyCode();
        System.out.println(code);
        if (code == 65) {
            System.out.println("Enter");
        }else if(code == 66){
            System.out.println("Escape");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("KeyReleased");

    }
}
