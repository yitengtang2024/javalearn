package com.yiteng.ui;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GameJFrame extends JFrame implements KeyListener {
    //create 2D array to manage the image position
    //used for multiple function below initData(), initImage().
    int[][] imagePosition = new int[4][4];
    int x =0;
    int y =0;

    public GameJFrame() {
        //init the play window
        initJFrame();
        //init the menu bar
        initJMenuBar();
        //init game data, random the sequence of the image
        //add image to the window according to this random sequence
        initData();
        //init the image
        initImage();

        //set the window is visible
        this.setVisible(true);
    }

    private void initJMenuBar() {
        //set the menu JmemnuBar
        // set the menu bar
        // set the main menu button
        JMenuBar menuBar = new JMenuBar();
        JMenu function = new JMenu("Function");
        JMenu about = new JMenu("About");
        //set the sub menu under the main menu
        JMenuItem reloadGame = new JMenuItem("Reload Game");
        JMenuItem relogin = new JMenuItem("Relogin");
        JMenuItem exiteGame = new JMenuItem("Exit");
        JMenuItem contact = new JMenuItem("Contact");
        //add the function button to the main mennu button as drop list
        function.add(reloadGame);
        function.add(relogin);
        function.add(exiteGame);
        about.add(contact);

        //add the main menu to the menuBar
        menuBar.add(function);
        menuBar.add(about);
        //set the menu the the window
        this.setJMenuBar(menuBar);
    }

    private void initJFrame() {
        //set the size of the window
        this.setSize(603, 680);
        //set the title of the window
        this.setTitle("Puzzle Game v1.0");
        //set the window always on top
        this.setAlwaysOnTop(true);
        //set the window to the middle
        this.setLocationRelativeTo(null);
        //cancel the default layout which is the center image
        //after cancel it will alow our x, y to add the image
        this.setLayout(null);
        //set game close method
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add key listener
        this.addKeyListener(this);
    }

    private void initImage() {

        this.getContentPane().removeAll();
        int fileNumber;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fileNumber = imagePosition[i][j];
                //create a new imageIcon
                //create a jLabel to accept the imageIcon
                JLabel jLabel = new JLabel(new ImageIcon("puzzleGame/image/animal/animal1/" + fileNumber + ".jpg"));
                //set he image position before add the lable to the frame
                jLabel.setBounds(105* j+83, 105 * i+134, 105, 105);
                //set border
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //this refer to the initJFrame address
                //need to add the jlabel to the invisible container
                this.getContentPane().add(jLabel);

            }
        }
        JLabel backGround = new JLabel(new ImageIcon("puzzleGame/image/background.png"));
        backGround.setBounds(40, 40, 508, 560);
        this.getContentPane().add(backGround);
        this.getContentPane().repaint();
    }

    private void initData() {
        int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        int tempNum = temp[15];
        for (int i = temp.length - 1; i > 0; i--) {
            int randomNum = random.nextInt(i);
            temp[i] = temp[randomNum];
            temp[randomNum] = tempNum;
            tempNum = temp[i - 1];

        }
        int count = 0;
        for (int i = 0; i < this.imagePosition.length; i++) {
            for (int j = 0; j < this.imagePosition[0].length; j++) {

                this.imagePosition[i][j] = temp[count];
                count++;
                //get the location of 0
                if(this.imagePosition[i][j] == 0){
                    x = i;
                    y = j;
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        // left37,up38,right39,down40
        if(code == 37){
            if(y==3){
                return;
            }
            imagePosition[x][y] = imagePosition[x][y+1];
            imagePosition[x][y+1] = 0;
            y++;
            initImage();
        }else if(code == 38){
            if(x==3){
                return;
            }
            imagePosition[x][y] = imagePosition[x+1][y];
            imagePosition[x+1][y] = 0;
            x++;
            initImage();
        }else if(code == 39){
            if(y==0){
                return;
            }
            imagePosition[x][y] = imagePosition[x][y-1];
            imagePosition[x][y-1] = 0;
            y--;
            initImage();
        }else if(code == 40){
            if(x==0){
                return;
            }
            imagePosition[x][y] = imagePosition[x-1][y];
            imagePosition[x-1][y] = 0;
            x--;
            initImage();
        }
    }
}
