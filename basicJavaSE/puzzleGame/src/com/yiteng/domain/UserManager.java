package com.yiteng.domain;

import java.io.*;
import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;
    public UserManager() {
        users = new ArrayList<>();
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

    //create I/O to save the user information
    public void saveToFile(String filePath) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            for (User user : users) {
                bw.write(user.getUsername() +","+user.getPassword());
                bw.newLine();
            }
        }
    }
    //load user from a text file
    public void loadFromFile(String filePath) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if(parts.length == 2){
                    users.add(new User(parts[0], parts[1]));//add all user
                }
            }
        }
    }

    //print all users for debugging
    public void printUsers() {
        for (User user : users) {
            System.out.println(user.getUsername() + "," + user.getPassword());
        }
    }
}
