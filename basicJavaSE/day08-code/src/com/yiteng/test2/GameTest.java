package com.yiteng.test2;

public class GameTest {
    public static void main(String[] args) {
        Role role1 = new Role("Jordan",100,"male");
        Role role2 = new Role("James",100,"female");

        //display the role information
        role1.showRoleInfo(role1);
        role2.showRoleInfo(role2);
        while(true){
            role1.attach(role2);
            if (role2.getHP() == 0){
                System.out.println(role1.getName()+"K.O."+role2.getName());
                break;
            }
            role2.attach(role1);
            if (role1.getHP() == 0){
                System.out.println(role1.getName()+"K.O."+role2.getName());
                break;
            }
        }
    }
}
