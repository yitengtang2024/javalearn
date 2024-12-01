package com.yiteng.studentmanagementadvanced;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        initialSystem(users);
        System.out.println("Welcome to the student management system");
        System.out.println("Please selection your operation:");
        System.out.println("1: login");
        System.out.println("2. Register");
        System.out.println("3. Forgot Password");
        System.out.println(users);
        String operation = scanner.nextLine();
        //scanner.nextLine();
        switch(operation){
            case "1":
                int count = 0;
                while(count<3){
                    System.out.println("Please enter your username:");
                    String username = scanner.nextLine();
                    System.out.println("Please enter your password:");
                    String password = scanner.nextLine();
                    String token = generateToken();
                    System.out.println("Your token is: " + token);
                    System.out.println("Please enter your token:");
                    String inputToken = scanner.nextLine();
                    while(!token.equals(inputToken)){
                        System.out.println("Invalid token, please try again");
                        inputToken = scanner.nextLine();
                    } 
                    if(checkLogin(users, username, password)){
                        System.out.println("Login successfully");
                        break;
                    }else{
                        System.out.println("Invalid username or password. You have " + (2-count) + " times left");
                        count++;
                    }
                    if(count==3){
                        System.out.println("You have tried too many times, please try again later");
                    }
                }
                
                break;
            case "2":
                register(users);
                break;
            case "3":
                //forgotPassword(users);
                System.out.println("Please enter your username:");
                String username = scanner.nextLine();
                if(checkUserNameExists(users, username)){
                    System.out.println("Plese enter your ID:");
                    String idNumber = scanner.nextLine();
                    System.out.println("Please enter your phone number:");
                    String phoneNumber = scanner.nextLine();
                    if(checkIdAndPhoneNumber(users, username, idNumber, phoneNumber)){
                        System.out.println("Please enter your new password:");
                        String newPassword = scanner.nextLine();
                        for(User user:users){
                            if(user.getUsername().equals(username)){
                                user.setPassword(newPassword);
                            }
                        }
                        System.out.println("Reset password successfully");
                    }else{
                        System.out.println("Invalid ID or phone number");
                    }
                }else{
                    System.out.println("Username does not exist");
                }
                break;
        }
    }
    // initial system, add some users for testing
    private static void initialSystem(ArrayList<User> users){
        User user1 = new User("admin","admin","370683198812120000","13999999999");
        User user2 = new User("user2","user2","370683198812120001","13999999998");
        users.add(user1);
        users.add(user2);
    }
    // register
    private static void register(ArrayList<User> users){
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        // enter username, check the uniqueness and format(length, char and number)
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        if (checkUsername(users, username)){
            System.out.println("Username already exists");
            return;
        }
        user.setUsername(username);
        //enter password twice and confirm they are same
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        System.out.println("Please enter again your password:");
        String confirmPasswrod = scanner.nextLine();
        if (!password.equals(confirmPasswrod)){
            System.out.println("Password does not match");
            return;
        }
        user.setPassword(password);
        //enter id and check(cannot start with 0, length 18, last one can be X or x)
        System.out.println("Please enter you id number:");
        String idNumber = scanner.nextLine();
        if(!checkIdNumber(idNumber)){
            System.out.println("Invalid id number");
            return;
        }
        user.setIdNumber(idNumber);
        //enter phone number and check(length 11 and cannot start with 0)
        System.out.println("Please enter your phone number:");
        String phoneNumber = scanner.nextLine();
        if(!checkPhoneNumber(phoneNumber)){
            System.out.println("Invalid phone number");
            return;
        }
        user.setPhoneNumber(phoneNumber);
        users.add(user);
        System.out.println("Register successfully");
    }
    private static boolean checkUsername(ArrayList<User> users, String username){
        int charCount = 0;//a-z, A-Z
        int numberCount = 0;//0-9
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) >= 'a' && username.charAt(i) <= 'z' || username.charAt(i) >= 'A' && username.charAt(i) <= 'Z') {
                charCount++;
            } else if (username.charAt(i) >= '0' && username.charAt(i) <= '9') {
                numberCount++;
            }
        }
        if(!((username.length()>=3 && username.length()<=15) && charCount>0 && numberCount>=0)){
            return true;
        }
        return false;
    }
    private static boolean checkIdNumber(String idNumber){
        if (idNumber.startsWith("0")){
            return false;
        }
        if(idNumber.length()!=18){
            return false;
        }
        for(int i =0; i<idNumber.length()-1; i++){
            if(idNumber.charAt(i)<'0' || idNumber.charAt(i)>'9'){
                return false;
            }
        }
        char lastChar = idNumber.charAt(17);
        if(lastChar<'0' || lastChar>'9' && lastChar!='X' && lastChar!='x'){
            return false;
        }
        
        return true;
    }
    private static boolean checkPhoneNumber(String phoneNumber){
        if(phoneNumber.length()!=11){
            return false;
        }
        if(phoneNumber.startsWith("0")){
            return false;
        }
        for(int i = 0; i<phoneNumber.length(); i++){
            if(phoneNumber.charAt(i)<'0' || phoneNumber.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }            
    //login
    //check username and password 
    private static boolean checkLogin(ArrayList<User> users, String username, String password){
        for(User user:users){
            if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    
    //generate 5 digit token, 4 digit a-z,A-Z and 1 digit 0-9
    private static String generateToken(){
        char[] token = new char[5];
        Random random = new Random();
        for(int i = 0; i<4; i++){
            while (true) { 
                int randomIndex = random.nextInt(64,122);
                if(randomIndex>=65 && randomIndex <=90 || randomIndex>=97 && randomIndex<=122){
                    char c = (char)randomIndex;
                    token[i] = c;
                    break;
                }
                
            }
        }
        int randomDigit = random.nextInt(10);
        char temp = token[0];
        token[4] = (char)(randomDigit + 48);//directly convert the random number generate the char from ASCII
        System.out.println(token);
        for(int i = 0; i<token.length; i++){
            temp = token[i];
            int randomIndex = random.nextInt(i,token.length);
           token[i] = token[randomIndex];
           token[randomIndex] = temp;
        }
        return new String(token);
    }


    //reset password
    //check if the user name exists
    private static boolean checkUserNameExists(ArrayList<User> users, String username){
        for(User user:users){
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    //check if id and phone number matched with the username
    private static boolean checkIdAndPhoneNumber(ArrayList<User> users, String username, String idNumber, String phoneNumber){
        for(User user:users){
            if(user.getUsername().equals(username)&&user.getIdNumber().equals(idNumber)&&user.getPhoneNumber().equals(phoneNumber)){
                return true;
            }
        }
        return false;
    }

}
