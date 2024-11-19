/*
 * rewrite equalt
 * let cat and dog same public class Animal 
 
 */
public class Animal{
    private String name;

    public Animal(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        Animal other = (Animal) obj;
        return this.name.equals(other.name);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");

        System.out.println("does cat and dog same class?" +cat.equals(dog));
        Animal pig = new Animal("dog");
        System.out.println("does pig and dog same class?" + pig.equals(dog));
    }
}
