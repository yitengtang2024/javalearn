package com.yiteng.domain;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;
    public UserManager() {
        users = new ArrayList<>();
        //add default values
        users.add(new User("gamemaster", "123456"));
        users.add(new User("user2", "abcde"));
    }

    //method to get all users
    public ArrayList<User> getUsers() {
        return users;
    }

    //method to check the duplicated username
    public boolean isDuplicate(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    //method to add new user
    public void addUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
    }

    //check username and passwordmath
    public boolean userNamePassWordMatch(String username, String password) {
        for (User user : users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    //get current loged in user
    public User getUserByUsername(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}
