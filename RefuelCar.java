/* 
 initial condition:
 vehicle fuel tank: capacity 30 L, Now 6 L left
 Gas station: fill 2L every 5 second
 target: fill the fuel tank to be full
 */

public class RefuelCar{
  public static void main(String[] args) {
    int tankCapacity = 30;
    int currentFuel = 6;
    int refuelRate =2;
    int timeInterval = 5;
    int totalTime = 0;

    System.out.println("Start refilling gas...");
    while (currentFuel<tankCapacity){
      currentFuel +=refuelRate;
      totalTime+=timeInterval;
      System.out.println("Filling, the current gas is:" + currentFuel + "L");
  }
  System.out.println("Filling completed, the time consuming is"+totalTime+"seconds");
  }
}
