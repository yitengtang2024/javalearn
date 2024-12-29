/*
 * student class hav id, name, chinese, math, english,
 * display theri grade for each and the average grad
 */
public class Student{
    private int id;
    private String name;
    private double chinese;
    private double math;
    private double english;

    public Student(int id, String name, double chinese, double math, double english){
        this.id = id;
        this.name=name;
        this.chinese=chinese;
        this.english=english;
        this.math=math;
    }
    public double getAverage(){
        return (chinese+english+math)/3;
    }
    public String toString(){
        return id + "\t" + name +"\t"+chinese +"\t" + math + "\t" + english +"\t" + String.format("%.1f",getAverage());
    }
    public static void main(String[] args) {
        Student[] students={
            new Student(1,"James",91.5,98.0,89.0),
            new Student(2,"Hardern", 88.9,97.8,95.5),            
            new Student(3,"Rocket", 90.0,89.9,79.9),
            new Student(4,"Clipper", 91.1,81.1,71.1)
        };
        System.out.println("ID\tName\tChinese\tMath\tEnglish\tAverage");
        for (Student student:students){
            System.out.println(student);
        }
    }

}
