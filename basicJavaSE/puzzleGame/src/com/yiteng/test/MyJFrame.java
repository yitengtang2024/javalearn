package com.yiteng.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");

    public MyJFrame() {
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        button1.setSize(50,50);
        button1.setLocation(0,0);
        button2.setSize(50,50);
        button2.setLocation(50,0);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button1.setVisible(true);
        button2.setVisible(true);

        this.getContentPane().add(button1);
        this.getContentPane().add(button2);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == button1) {
            button1.setSize(100,100);
        }else if (source == button2) {
            Random r = new Random();
            button2.setLocation(r.nextInt(500),r.nextInt(500));
        }

    }
}
