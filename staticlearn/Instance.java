/*
 * This file document the Instance in java
 * I record my understanding abou the Instance
 * record help me to remember and review
 */

// instance is created from class to make the class can be used see below the example


//define a class first
package staticlearn;
class Person{
  String name;
  int age;//this is the atrribute of this public class Instance 

  //method this is the method inside this public class Instance 
  void introduce(){
    System.out.println("My name is "+name+"and I am "+age+"years old.");
  } 
}

// create instance to cite the class. None static class cannot direct used
public class Instance{
  public static void main(String[] args) {
    Person person1= new Person(); // create a Instance 
    person1.name ="Alice";
    person1.age=25;
    person1.introduce();

    Person person2=new Person(); // create second person instance, after the instance create, it can use the name and age
    person2.name="Bob";
    person2.age=30;
    person2.introduce();
  }
}
/*
 * the different between class and instance
 * class is the blueprint, define the attribute and methods
 * instance created from class but it is the accurate single target or object
 * class does not occupy RAM, instance occupy RAM
 * class cannot directly used without instance,
 * instance can use the method and attribute
 * class is the only, every instance is independent
 */
