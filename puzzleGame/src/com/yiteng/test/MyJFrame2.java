package com.yiteng.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyJFrame2 extends JFrame implements MouseListener, MouseMotionListener {
    JButton button = new JButton();

    public MyJFrame2() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        button.setBounds(0, 0, 100, 100);
        button.setBackground(Color.GREEN);
        this.getContentPane().add(button);
        button.addMouseListener(this);
        button.addMouseMotionListener(this);

        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouseDragged");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouseMoved");

    }
}
