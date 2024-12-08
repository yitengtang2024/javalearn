package com.yiteng.ui;

import com.yiteng.domain.User;
import com.yiteng.domain.UserManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GameJFrame extends JFrame implements KeyListener,ActionListener {
    private UserManager userManager;
    private User currentUser;
    //set the sub menu under the main menu
    JMenuItem newGame = new JMenuItem("New Game");
    JMenuItem reloadGame = new JMenuItem("Reload Game");
    JMenuItem relogin = new JMenuItem("Relogin");
    JMenuItem exiteGame = new JMenuItem("Exit");
    JMenuItem contact = new JMenuItem("Contact");

    JMenuItem girl = new JMenuItem("Girl");
    JMenuItem animal = new JMenuItem("Animal");
    JMenuItem sport = new JMenuItem("Sport");


    //create 2D array to manage the image position
    //used for multiple function below initData(), initImage().
    int[][] imagePosition = new int[4][4];
    int[][] winArray = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    String path = "src/image/animal/animal1/";///Users/yitengtang/Desktop/heima/puzzleGame/image/animal/animal1/1.jpg
    // the x, y position of picture 0 empty space
    int x = 0;
    int y = 0;
    // the steps count
    int steps = 0;

    public GameJFrame(UserManager userManager, User currentUser) {
        this.userManager = userManager;
        this.currentUser = currentUser;
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
        JMenu changePicture = new JMenu("Change Picture");

        //add the function button to the main mennu button as drop list
        function.add(newGame);
        function.add(changePicture);
        function.add(reloadGame);
        function.add(relogin);
        function.add(exiteGame);
        about.add(contact);
        changePicture.add(girl);
        changePicture.add(animal);
        changePicture.add(sport);

        //add the main menu to the menuBar
        menuBar.add(function);
        menuBar.add(about);
        //set the menu the the window
        this.setJMenuBar(menuBar);
        newGame.addActionListener(this);
        reloadGame.addActionListener(this);
        relogin.addActionListener(this);
        exiteGame.addActionListener(this);
        contact.addActionListener(this);
        girl.addActionListener(this);
        sport.addActionListener(this);
        animal.addActionListener(this);
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

        JLabel steps = new JLabel("Steps: "+ this.steps);
        steps.setBounds(50,30,200,30);
        this.getContentPane().add(steps);
        if (victory()){
            JLabel victoryLogo = new JLabel(new ImageIcon("src/image/win.png"));
            victoryLogo.setBounds(205,305,197,73);
            this.getContentPane().add(victoryLogo);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fileNumber = imagePosition[i][j];
                //create a new imageIcon
                //create a jLabel to accept the imageIcon
                JLabel jLabel = new JLabel(new ImageIcon(path + fileNumber + ".jpg"));
                //set he image position before add the lable to the frame
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //set border
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //this refer to the initJFrame address
                //need to add the jlabel to the invisible container
                this.getContentPane().add(jLabel);

            }
        }
        JLabel backGround = new JLabel(new ImageIcon("src/image/background.png"));
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
        x=0;
        y=0;
        for (int i = 0; i < this.imagePosition.length; i++) {
            for (int j = 0; j < this.imagePosition[0].length; j++) {

                this.imagePosition[i][j] = temp[count];
                count++;
                //get the location of 0
                if (this.imagePosition[i][j] == 0) {
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
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel fullImage = new JLabel(new ImageIcon(path + "all.jpg"));
            fullImage.setBounds(83, 134, 420, 420);
            this.getContentPane().add(fullImage);

            JLabel background = new JLabel(new ImageIcon("src/image/background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
         }
         int code = e.getKeyCode();
        // left37,up38,right39,down40
        if (code == 37) {
            if (y == 3) {
                return;
            }
            imagePosition[x][y] = imagePosition[x][y + 1];
            imagePosition[x][y + 1] = 0;
            y++;
            steps++;
            initImage();
        } else if (code == 38) {
            if (x == 3) {
                return;
            }
            imagePosition[x][y] = imagePosition[x + 1][y];
            imagePosition[x + 1][y] = 0;
            x++;
            steps++;
            initImage();
        } else if (code == 39) {
            if (y == 0) {
                return;
            }
            imagePosition[x][y] = imagePosition[x][y - 1];
            imagePosition[x][y - 1] = 0;
            y--;
            steps++;
            initImage();
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            imagePosition[x][y] = imagePosition[x - 1][y];
            imagePosition[x - 1][y] = 0;
            x--;
            steps++;
            initImage();
        } else if (code == 65) {
            initImage();
        }else if (code == 87){
            imagePosition = winArray;
            initImage();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        System.out.println(source);
        Random r = new Random();
        if (source == reloadGame && !victory()) {//this can be only used before victory
            steps = 0;
            initData();
            victory();
            initImage();
        }else if(source == newGame){//start a new game
            this.dispose();
            new GameJFrame(userManager, currentUser);

        } else if (source == relogin) {
            System.out.println("relogin");
            //close current window
            this.setVisible(false);
            //open the login window
            new LoginJFrame(userManager);
        }else if (source == exiteGame) {
            System.exit(0);// close JVM
        }else if (source == contact) {
            System.out.println("contact");
            System.out.println(source);
            // create a prompt window
            JDialog dialog = new JDialog();
            JLabel contact = new JLabel(new ImageIcon("src/image/about.png"));
            contact.setBounds(0,0,258,258);
            dialog.getContentPane().add(contact);
            dialog.setSize(344,344);
            dialog.setAlwaysOnTop(true);
            dialog.setLocationRelativeTo(null);
            dialog.setModal(true);
            dialog.setVisible(true);
        }else if (source == girl && !victory()) {
            this.getContentPane().removeAll();
            int folderNumber = r.nextInt(13)+1;
            System.out.println(folderNumber);
            path ="src/image/girl/girl"+folderNumber+"/";
            System.out.println(path);
            steps = 0;
            initData();
            initImage();
            this.getContentPane().repaint();
        }else if (source == animal && !victory()) {
            this.getContentPane().removeAll();
            int folderNumber = r.nextInt(8)+1;
            System.out.println(folderNumber);
            path ="src/image/animal/animal"+folderNumber+"/";
            System.out.println(path);
            steps = 0;
            initData();
            initImage();
            this.getContentPane().repaint();
        }else if (source == sport){
            this.getContentPane().removeAll();
            int folderNumber = r.nextInt(10)+1;
            System.out.println(folderNumber);
            path ="src/image/sport/sport"+folderNumber+"/";
            System.out.println(path);
            steps = 0;
            initData();
            initImage();
            this.getContentPane().repaint();
        }
    }

    private boolean victory() {

        for (int i = 0; i < imagePosition.length; i++) {
            for (int j = 0; j < imagePosition[0].length; j++) {
                if (imagePosition[i][j] != winArray[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
