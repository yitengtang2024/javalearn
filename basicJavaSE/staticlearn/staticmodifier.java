/*
 * in java, static is belong to class level attribute
 * static is not an instance or object
 * non static member belong to some object, when create an object, there is an instance variable
 * static belong to class, no mater how many object created, there is only one static in the memory,
 * it can be accessed directly without creating an instance
 */

//static properties
//1. static can be shared 
//2. no need to create instance
//3. lifetime when the program end, it will be destroyed
//4.static method cannot access non static method member,due to non static is instance, static is public class staticmodifier 
//5. this and super cannot be used in static method, because they are related to the object

//how to use it
//1 static variable
class Counter(){
  static int count =0;//static variable
  Counter(){
    count++;
  }
}
public class Main{
  public static void main(String[] args) {
    new Counter();
    new Counter();
    new Counter();
    System.out.println("Counter: "+Counter.count);//this should output Counter: 3
  }
}

//2 static method 
class MathUtils{
  static int add(int a, int b){
    return a+b;
  }
}

public class Main{
  public static void main(String[] args) {
    int sum =MathUtils.add(5,10);// no need to create instance such as Sum sum = new sum 
    System.out.println("Sum: "+ sum);// ouput Sum: 15
  }
}

//3 static block use to initial lize
class Demo{
  static int value;

  //static blcok
  static{
  value=42;
  System.out.println("Static Block excuted!");
  }
}

public class Main{
  public static void main(String[] args) {
    System.out.println(Demo.value);// 42
  }
}
//4 static inner class 
class Outer{
  static class Inner{
    void display(){
    System.out.println("Inside static inner class!");}
  }
}

public class Main{
public static void main(String[] args) {
  Outer.Inner inner = new Outer.Inner();// do not need the outer instance or object
  inner.display();
}}

// the different of static inner class and non static inner class
class Outer{
  class Inner{
    void display(){
    System.out.println("Inside non-static class");
    }
  }
}
public class Main{
  public static void main(String[] args) {
    // need to create instance first
    Outer outer = new Outer();

    // access Inner through outer
    Outer.Inner inner = outer.new Inner();
    inner.display();
  }
}
