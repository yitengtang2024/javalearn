package com.yiteng.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;



public class studentManagement {
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<Student> students = new ArrayList<>();
        while (flag) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("-------------添加学生-------------");
                    addStudent(students);
                    System.out.println(students);
                    break;
                case 2:
                    System.out.println("-------------删除学生-------------");
                    System.out.println("Entere the student Id to delete: ");
                    String deleteID = sc.next();
                    deleteStudent(students, deleteID);
                    break;
                case 3:
                    System.out.println("-------------修改学生-------------");
                    System.out.println("Enter the student Id to update: ");
                    String studentId = sc.next();
                    updateStudent(students, studentId);
                    break;
                case 4:
                    System.out.println("-------------查询学生-------------");
                    System.out.println("Enter the student Id to search: ");
                    String studentID = sc.next();
                    searchStudent(students, studentID);
                    break;
                case 5:
                    System.out.println("-------------退出-------------");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    // add student to the arraylist and the student id is unique
    private static void addStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        while (true) {
            System.out.println("student id:");
            student.setId(sc.next());
            sc.nextLine();
            if (!checkID(students, student.getId())) {

                break;
            } else {
                System.out.println("duplicated ID, the ID is an unique number");
            }
        }
        System.out.println("student name:");
        student.setName(sc.nextLine());
        System.out.println("student age:");
        student.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("student address:");
        student.setAddress(sc.nextLine());
        students.add(student);

    }
    // delete student record by ID

    private static void deleteStudent(ArrayList<Student> students, String id) {
        boolean removed = students.removeIf(student -> student.getId().equals(id));

        if (removed) {
            System.out.println("students with id " + id + " was removed");
        } else {
            System.out.println("students with id " + id + " was not found");
        }
    }

    // check the student ID exist in the arraylist or not
    private static boolean checkID(ArrayList<Student> students, String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }

        }
        return false;
    }

    // update student by ID
    private static void updateStudent(ArrayList<Student> students, String id) {
        Scanner sc = new Scanner(System.in);
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Enter a new name: ");
                student.setName(sc.nextLine());
                System.out.println("Enter a new age: ");
                student.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter a new address: ");
                student.setAddress(sc.nextLine());
                System.out.println("Successfull updated");
                return;
            }

        }
        System.out.println("student with id " + id + " was not found");
    }

    // search student
    private static void searchStudent(ArrayList<Student> students, String id) {
        System.out.println("id    "+"name    "+"age    "+"address");
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
            }
        }
    }
}

