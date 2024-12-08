package com.yiteng.test;

import com.yiteng.domain.User;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("user1","user1");
        User u2 = new User("user2","user2");

        users.add(u1);
        users.add(u2);

        for (User user : users) {

            System.out.println(user);
        }

    }
}
