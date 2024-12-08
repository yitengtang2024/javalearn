package com.yiteng.ui;

import com.yiteng.domain.User;
import com.yiteng.domain.UserManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;


public class LoginJFrame extends JFrame implements ActionListener{
    private UserManager userManager;

    String path = "image/login/";
    //arrayList to save the user information
    ArrayList<User> users = new ArrayList<User>();
    //username and password input field
    JTextField userinput = new JTextField();
    JPasswordField passwordinput = new JPasswordField();
    //token input
    JTextField tokeninput = new JTextField();
    //token image
    JLabel tokenimage = new JLabel(new ImageIcon());
    //show password button
    JButton showPass = new JButton(new ImageIcon(path+"显示密码.png"));


    String token = generateToken();

    public LoginJFrame(UserManager userManager) {
        this.userManager = userManager;

        //create the registor JFrame window
        initJFrame();
        // initial the registor window image and login password textbox
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

        userinput.setBounds(190,145,200,34);
        this.getContentPane().add(userinput);
        //password and password input
        JLabel password = new JLabel(new ImageIcon(path+"密码.png"));
        password.setBounds(125,200,36,16);
        passwordinput.setEchoChar('*');
        passwordinput.setBounds(190,195,200,34);
        this.getContentPane().add(passwordinput);
        this.getContentPane().add(password);
        //
        //display password button

        showPass.setBounds(400, 195 , 18, 29);
        this.getContentPane().add(showPass);
        //token and token box
        JLabel token = new JLabel(new ImageIcon(path +"验证码.png"));
        token.setBounds(125,250,56,21);
        this.getContentPane().add(token);

        tokeninput.setBounds(190,245,100,34);
        this.getContentPane().add(tokeninput);
        //add generated token image

        refreshToken();
        this.getContentPane().add(tokenimage);
        //add login button
        JButton login = new JButton(new ImageIcon(path+"登录按钮.png"));
        login.setBounds(125,290,128,47);
        this.getContentPane().add(login);
        //add registor button
        JButton registor = new JButton(new ImageIcon(path+"注册按钮.png"));
        registor.setBounds(260,290,128,47);
        this.getContentPane().add(registor);
        //login background
        JLabel background = new JLabel(new ImageIcon(path + "background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
        this.setVisible(true);


        //add Actionlistener to the button
        login.setActionCommand("login");
        registor.setActionCommand("registor");
        showPass.setActionCommand("showPass");

        login.addActionListener(this);
        registor.addActionListener(this);
        showPass.addActionListener(this);

        //add MouseListener to token image
        //use mouseadapter, it only need to override the needed method
        tokenimage.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshToken();
            }
        });
    }
    //init or refresh token image every click
    private void refreshToken() {
        this.token = generateToken();
        tokenimage.setBounds(300,245,150,34);
        tokenimage.setIcon(generateImage(this.token));
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

    //compare the token is valid
    private boolean tokenSame(){
        String userToken = tokeninput.getText();
        return userToken.equalsIgnoreCase(token);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String userInput = userinput.getText();
        String passwordInput = passwordinput.getText();


        if(command.equals("login")){
            if(userManager.userNamePassWordMatch(userInput,passwordInput)&&tokenSame()){
                User loggedInUser = userManager.getUserByUsername(userInput);
                this.dispose();
                new GameJFrame(userManager,loggedInUser);
            }else if(!userManager.userNamePassWordMatch(userInput,passwordInput)){
                JOptionPane.showMessageDialog(this,"the username or password is incorrect");
            }else if(!tokenSame()){
                JOptionPane.showMessageDialog(this,"the token is incorrect");
            }else{
                JOptionPane.showMessageDialog(this,"invalid input");
            }

        }else if(command.equals("registor")){

            new RegisterJFrame(userManager);
            //close the login window
            this.dispose();
        }else if(command.equals("showPass")){
            if(passwordinput.getEchoChar() == '\u0000'){
                passwordinput.setEchoChar('*');
            }else{
                passwordinput.setEchoChar((char)0);
            }

        }
    }
    //overide the acition listener function
    //enable the color change of the login button


}
