/*
 * simulation driving a car
 * include accelerate and brake
 */
public class Car{
    private int speed;

    public Car(){
        this.speed=0;
    }
    public void accelerate(int amount){
        speed+=amount;
        System.out.println("Speed: "+speed+"miles/hour");
    }
    public void brake(int amount){
    if (speed>amount){
            speed-=amount;
            System.out.println("Speed: "+speed+"miles/hour");
        }else{
            speed=0;
            System.out.println("Speed: "+speed+"miles/hour");
        }
    }
    public static void main(String[] args) {
        Car car=new Car();
        car.accelerate(10);
        car.accelerate(10);
        car.brake(20);
    }
}
