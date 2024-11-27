package com.yiteng.test6;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        boolean flag = false;
        int count = 0;

        Student s1 = new Student(1,"James",18);
        Student s2 = new Student(2,"Bob",18);
        Student s3 = new Student(3,"John",18);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        printstudent(students);
        students = addStudents(students,4,"Geroge",30, count, flag);
        printstudent(students);
        students = updateStudent(students,4);
        printstudent(students);
        students = deleteStudent(students,4);
        printstudent(students);


    }
    private static Student[] addStudents(Student[] students,int id, String name, int age, int count, boolean flag) {
        flag = isFlag(students, id);
        if(flag){
            System.out.println("Student ID already exist");
        }else{
            count = getCount(students);
            if(count < students.length){
                students[count] = new Student(id,name,age);
            }else{
                students = createStudents(students, count);
                students[count] = new Student(id,name,age);
            }
        }
        return students;
    }



    private static boolean isFlag(Student[] students, int id) {
        for (Student student : students) {
            if (student.getId() ==  id) {
                System.out.println("Student already exist!");
                return true;
            }

        }
        return false;
    }

    private static void printstudent(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.toString());
            }else{
                break;
            }
        }
    }
    private static int getCount(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }

        }
        return count;
    }
    private static Student[] createStudents(Student[] students, int count){
        count = getCount(students);
        Student[] newstudents = new Student[count+1];
        for (int i = 0; i < students.length; i++) {
            newstudents[i]=students[i];
        }
        return newstudents;

    }
    private static Student[] updateStudent(Student[] students, int id){
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i].setAge(students[i].getAge()+1);
                exist = true;
                System.out.println("student age is updated");
            }
        }
        if (!exist) {
            System.out.println("student ID is not exist.");

        }

        return students;
    }
    private static Student[] deleteStudent(Student[] students, int id) {
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                exist = true;
                students[i] = null;
                System.out.println("student ID is deleted");
            }
        }
        if (!exist) {
            System.out.println("student ID is not exist.");
        }
        return students;
    }
}
