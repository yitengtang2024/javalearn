package com.yiteng.test1;

public class GameTest {
    public static void main(String[] args) {
        Role role1 = new Role("Jordan",100);
        Role role2 = new Role("James",100);

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
