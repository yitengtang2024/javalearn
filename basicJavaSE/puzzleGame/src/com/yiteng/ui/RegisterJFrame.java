package com.yiteng.ui;

import com.yiteng.domain.User;
import com.yiteng.domain.UserManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements ActionListener {

    //root path of all the images
    String path = "src/image/register/";
    //pass users ArrayList
    private UserManager userManager;
    //username input text
    JTextField usernameInput = new JTextField();
    //pasword input text
    JPasswordField passwordInput = new JPasswordField();
    //confime password input text
    JPasswordField passwordConfirm = new JPasswordField();
    //register button
    JButton registor = new JButton(new ImageIcon(path + "注册按钮.png"));
    //reset button
    JButton reset = new JButton(new ImageIcon(path + "重置按钮.png"));


    public RegisterJFrame(UserManager userManager) {
        this.userManager = userManager;
        initJFrame();

        initImage();
    }

    //init the JFrame
    private void initJFrame() {
        //set the size of the window
        this.setTitle("Register");
        this.setSize(488, 500);
        //set the window always on top
        this.setAlwaysOnTop(true);
        //set the window to the middle
        this.setLocationRelativeTo(null);
        //set game close method
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //init the image of register page
    private void initImage() {
        //username JLabel
        JLabel username = new JLabel(new ImageIcon(path + "注册用户名.png"));
        username.setBounds(100, 170, 79, 17);
        this.getContentPane().add(username);
        //username input field

        usernameInput.setBounds(190, 160, 200, 34);
        this.getContentPane().add(usernameInput);
        //pasword JLabel
        JLabel password = new JLabel(new ImageIcon(path + "注册密码.png"));
        password.setBounds(100, 210, 79, 17);
        this.getContentPane().add(password);
        //password input passwordfield

        passwordInput.setBounds(190, 200, 200, 34);
        this.getContentPane().add(passwordInput);
        //confirm password JLabel
        JLabel confirmPassword = new JLabel(new ImageIcon(path + "再次输入密码.png"));
        confirmPassword.setBounds(80, 250, 96, 17);
        this.getContentPane().add(confirmPassword);
        //confirm password passwordField

        passwordConfirm.setBounds(190, 240, 200, 34);
        this.getContentPane().add(passwordConfirm);
        // register button

        registor.setBounds(100, 300, 128, 47);
        this.getContentPane().add(registor);
        //reset button

        reset.setBounds(240, 300, 128, 47);
        this.getContentPane().add(reset);
        JLabel backGround = new JLabel(new ImageIcon("src/image/register/background.png"));
        backGround.setBounds(0, 0, 470, 390);
        this.getContentPane().add(backGround);
        this.setVisible(true);

        //set the button command
        registor.setActionCommand("register");
        reset.setActionCommand("reset");

        //add action to the button
        registor.addActionListener(this);
        reset.addActionListener(this);
    }

    //confirm password same
    private boolean confirmPassword() {
        String password = passwordInput.getText();
        String confirmPassword = passwordConfirm.getText();
        return password.equals(confirmPassword);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String newUsername = usernameInput.getText();
        String newPassword = passwordInput.getText();
        if (e.getActionCommand().equals("register")) {
            System.out.println("register");
            if(!userManager.isDuplicate(newUsername)&&confirmPassword()) {
                userManager.addUser(newUsername,newPassword);
                new LoginJFrame(userManager);
                this.dispose();
            }else if(userManager.isDuplicate(newUsername)) {
                JOptionPane.showMessageDialog(this, "username already exist");
            }else if(!confirmPassword()) {
                JOptionPane.showMessageDialog(this,"two password are not same");
            }else{
                JOptionPane.showMessageDialog(this,"invalid username or password");
            }
        }else if (e.getActionCommand().equals("reset")) {
            System.out.println("reset");
            new RegisterJFrame(userManager);
            this.dispose();
        }

    }


}
