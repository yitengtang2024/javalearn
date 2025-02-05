package com.yiteng.doudizhu2.game;

import com.yiteng.util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginJFrame extends JFrame implements MouseListener {
    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();
    JLabel rightCode = new JLabel();

    public LoginJFrame() {
        //init JFrame
        initJFrame();
        //init components
        initView();

        this.setVisible(true);
    }
    private void initJFrame() {
        this.setSize(633,423);
        this.setTitle("Fight with the lord");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
    private void initView() {
        //add username, password, token
        Font usernameFont = new Font(null,1,16);
        JLabel usernameText = new JLabel("Username:");
        usernameText.setForeground(Color.WHITE);
        usernameText.setFont(usernameFont);
        usernameText.setBounds(140,55,55,22);
        this.getContentPane().add(usernameText);

        //add user input box

        username.setBounds(223,46,200,30);
        this.getContentPane().add(username);

        //add password
        JLabel passwordText = new JLabel("Password:");
        passwordText.setForeground(Color.WHITE);
        passwordText.setFont(usernameFont);
        passwordText.setBounds(197,95,40,20);
        this.getContentPane().add(passwordText);

        //add password inputbox

        password.setBounds(263,87,160,30);
        this.getContentPane().add(password);

        //add token
        JLabel codeText = new JLabel("Code:");
        codeText.setForeground(Color.WHITE);
        codeText.setFont(usernameFont);
        codeText.setBounds(215,142,55,22);
        this.getContentPane().add(codeText);
        //add token input box

        code.setBounds(291,133,100,30);
        this.getContentPane().add(code);

        //get the token code
        String codeStr = CodeUtil.getCode();

        rightCode.setForeground(Color.RED);
        rightCode.setFont(usernameFont);
        rightCode.setText(codeStr);
        rightCode.addMouseListener(this);
        rightCode.setBounds(400,133,100,30);
        this.getContentPane().add(rightCode);

        //add login button

        login.setBounds(123,310,128,47);
        login.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/login/登录按钮.png"));
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addMouseListener(this);
        this.getContentPane().add(login);

        //add register button

        register.setBounds(256,310,128,47);
        register.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/login/注册按钮.png"));
        register.setBorderPainted(false);
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //add background image
        JLabel background = new JLabel(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/login/background.png"));
        background.setBounds(0,0,633,423);
        this.getContentPane().add(background);



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            String codeInput = code.getText();
            if(codeInput.equalsIgnoreCase(rightCode.getText())) {
                System.out.println("here you go");
            }
            else if(usernameInput.equals("")){
                showJDialog("no user name");
            }
            else{
                System.out.println("wrong code");
                showJDialog("wrong code");
            }
        }
        else if(source == register) {
            System.out.println(("register"));
        }
        else if(source == rightCode) {
            rightCode.setText(CodeUtil.getCode());
        }
    }
    public void showJDialog(String content) {
        JDialog dialog = new JDialog(LoginJFrame.this, true);
        dialog.setSize(200,150);
        dialog.setAlwaysOnTop(true);
        dialog.setLocationRelativeTo(null);

        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        dialog.getContentPane().add(warning);
        dialog.setVisible(true);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == login) {
            login.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/login/登录按下.png"));
        }
        else if(e.getSource() == register) {
            register.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/login/注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource() == login) {
            login.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/login/登录按钮.png"));
        }
        else if(e.getSource() == register) {
            register.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/login/注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
