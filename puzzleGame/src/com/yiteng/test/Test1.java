package com.yiteng.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Test1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(603,680);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Listening testing");
        frame.setAlwaysOnTop(true);
        frame.setLayout(null);

        JButton jtb = new JButton("Click Me");
        jtb.setBounds(50,50,100,50);
        jtb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cliked");
            }
        });

        frame.getContentPane().add(jtb);





        frame.setVisible(true);
    }
}
