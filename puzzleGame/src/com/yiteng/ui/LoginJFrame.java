package com.yiteng.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class LoginJFrame extends JFrame {
    String path = "image/login/";
    String token = generateToken();

    public LoginJFrame() {
        initJFrame();

        initImage();
    }

    private void initJFrame() {
        //set the size of the window
        this.setTitle("Login");
        this.setSize(488,430);
        //set the window always on top
        this.setAlwaysOnTop(true);
        //set the window to the middle
        this.setLocationRelativeTo(null);
        //set game close method
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //title
        this.setTitle("Puzzle Game v1.0 Login");

        //set the window is visible
        this.setVisible(true);
    }

    private void initImage(){
        this.getContentPane().removeAll();

        //username and username input
        JLabel username = new JLabel(new ImageIcon(path + "用户名.png"));
        username.setBounds(125,150,47,17);
        this.getContentPane().add(username);
        JTextField userinput = new JTextField();
        userinput.setBounds(190,145,200,34);
        this.getContentPane().add(userinput);
        //password and password input
        JLabel password = new JLabel(new ImageIcon(path+"密码.png"));
        password.setBounds(125,200,36,16);
        JTextField passwordinput = new JTextField();
        passwordinput.setBounds(190,195,200,34);
        this.getContentPane().add(passwordinput);
        this.getContentPane().add(password);
        //token and token box
        JLabel token = new JLabel(new ImageIcon(path +"验证码.png"));
        token.setBounds(125,250,56,21);
        this.getContentPane().add(token);
        JTextField tokeninput = new JTextField();
        tokeninput.setBounds(190,245,100,34);
        this.getContentPane().add(tokeninput);
        JLabel tokenimage = new JLabel(new ImageIcon());
        tokenimage.setBounds(300,245,56,21);
        tokenimage.setIcon(generateImage(this.token));
        this.getContentPane().add(tokenimage);
        //login background
        JLabel background = new JLabel(new ImageIcon(path + "background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
        this.setVisible(true);
    }
    //generate a random token
    private String generateToken(){
        String chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder token = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            token.append(chars.charAt(random.nextInt(chars.length())));
        }
            return token.toString();
    }
    //convert the random token to a picture
    private ImageIcon generateImage(String token){
        int width = 150;
        int height = 50;

        //create a bufferedImage
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        //set rendering hints for smooth text
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        //set background and text color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(Color.BLACK);

        //draw the token String
        g2d.setFont(new Font("Arial", Font.BOLD,24));
        FontMetrics fm = g2d.getFontMetrics();
        int x = (width - fm.stringWidth(this.token)) / 2;
        int y = (height - fm.getHeight()) / 2 + fm.getAscent();
        g2d.drawString(this.token, x, y);

        g2d.dispose();
        return new ImageIcon(image);
    }

}
