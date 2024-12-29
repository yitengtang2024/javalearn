class Bird{
    public void fly(){
        System.out.println("Bird can fly!");
    }
}
class Chicken extends Bird{
    @Override
    public void fly(){
        System.out.println("Chickend canot fly!");
    }
}
public class TestInstance{
    public static void main(String[] args) {
        Bird chicken = new Chicken();
        if (chicken instanceof Bird){
            System.out.println("Chicken is a Bird!");
        }else{
            System.out.println("Chicken is not a Bird.");
        }
        
    }
}
