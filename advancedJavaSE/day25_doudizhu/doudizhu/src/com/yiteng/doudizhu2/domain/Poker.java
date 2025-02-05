package com.yiteng.doudizhu2.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Poker extends JLabel implements MouseListener {
    //牌的名字
    private String name;
    //牌显示正面还是反面
    private boolean up;
    //是否可点击
    private boolean canClick = false;
    //当前状态，是否已经被点击
    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;
        //判断当前的牌是显示正面还是背面
        if (this.up){
            this.turnFront();
        }else {
            this.turnRear();
        }
        //设置牌的宽高大小
        this.setSize(71, 96);
        //把牌显示出来
        this.setVisible(true);
        //给每一张牌添加鼠标监听
        this.addMouseListener(this);
    }


    //显示正面
    public void turnFront() {
        this.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/poker/"+name+".png"));
        this.up = true;
    }

    //显示背面
    public void turnRear() {
        this.setIcon(new ImageIcon("/Users/yitengtang/Desktop/javalearn/advancedJavaSE/day25_doudizhu/doudizhu/image/poker/rear.png"));
        this.up = false;
    }


    //出牌时，需要点击牌
    //被点击之后，牌向上移动20个像素
    //再次被点击，牌回落20个像素
    @Override
    public void mouseClicked(MouseEvent e) {
        if (canClick) {
            Point from = this.getLocation();
            int step;
            if (clicked)
                step = -20;
            else {
                step = 20;
            }
            clicked = !clicked;

            //。。。牌被点击之后，还需要写移动牌的代码

        }
    }

    public void mouseEntered(MouseEvent arg0) {
    }

    public void mouseExited(MouseEvent arg0) {
    }

    public void mouseReleased(MouseEvent arg0) {
    }

    public void mousePressed(MouseEvent e) {
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

}
