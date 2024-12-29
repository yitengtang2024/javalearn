package com.yiteng.test1;
/*
*verbal version street fighter
* practice for javabean class
* private, default setting
* need create a Role class with name, HP amount, method need action that attack
 */

import java.util.Random;

public class Role {
    //private attribute
    private String name;
    private int hp;

    //set the defaulat with and without attribute
    public Role(){};
    public Role(String name, int hp){
        this.name = name;
        this.hp =hp;
    };


    //set and get method for each attribute
    public String getName(){
        return name;
    }
    public int getHP(){
        return hp;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHP(int hp){
        this.hp = hp;
    }

    //actions or method
    //who attach first
    //random int for each attach damage
    //deterimen the remain hp if less than 0 go back to 0
    public void attach(Role role){
        Random r = new Random();
        int attach = r.nextInt(1,20);
        int remainHp = role.getHP();
        remainHp = remainHp - attach;
        remainHp = remainHp<0? 0: remainHp;
        role.setHP(remainHp);
        System.out.println(this.getName()+" attached "+ role.getName()+" and it caused "+attach+" damage. "+
                role+" has "+ role.getHP() +" left!");
    }
}
