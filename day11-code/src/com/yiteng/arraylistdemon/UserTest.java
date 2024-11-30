package com.yiteng.arraylistdemon;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        // create 3 user
        User user1 = new User(1,"James","user001");
        User user2 = new User(2,"Bob","user002");
        User user3 = new User(3,"John","user003");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(users);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a name to search:");
        String name = scanner.nextLine();
        boolean result = checkExist(users, name);
        System.out.println(result);

        //check if the user is exist
    }
    private static boolean checkExist(ArrayList<User> users, String name) {
        boolean flag = false;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getName().equals(name)){
                flag = true;
            }

        }
        return flag;
    }
}
