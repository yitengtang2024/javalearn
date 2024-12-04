/*
 * catogry the animal from parent class to child class
 */
//animal parent
abstract class AnimalCatogry{
    public abstract void eat();
}
class Eagle extends AnimalCatogry{
    @Override
    public void eat(){
        System.out.println("Eagle eat small animals!");
    }
}
class Frog extends AnimalCatogry{
    @Override
    public void eat(){
        System.out.println("Frog eat small insects!");
    }
}
class Beetle extends AnimalCatogry{
    @Override
    public void eat(){
        System.out.println("Beetle eat plants!");
    }
}

