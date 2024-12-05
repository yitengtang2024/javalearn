package com.yiteng.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {

    public GameJFrame() {
        initJFrame();
        initJMenuBar();

        //set the window is visible
        this.setVisible(true) ;
    }

    private void initJMenuBar() {
        //set the menu JmemnuBar
        // set the menu bar
        // set the main menu button
        JMenuBar menuBar = new JMenuBar();
        JMenu function = new JMenu("Function");
        JMenu about = new JMenu("About");
        //set the sub menu under the main menu
        JMenuItem reloadGame= new JMenuItem("Reload Game");
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
        //set game close method
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
