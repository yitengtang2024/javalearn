/*
 * This task involves creating a class to represent a water pool
 * the pool starts with a water level 0
 * add water to the pool by 3 units at a time 
 * remove water from the pool by 2 unit  a time 
 */

public class WaterPool{
    private static int waterLevel =0;

    public static void addWater(){
        waterLevel +=3;
        System.out.println("the water level is "+ waterLevel);
    }
    public static void removeWater(){
        if (waterLevel > 2){
            waterLevel-=2;
            System.out.println("the water leve is "+ waterLevel);
        }else{
            System.out.println("This is not enough water.");
        }
    }

    public static void main(String[] args) {
        addWater();
        removeWater();
        addWater();
        removeWater();
    }
}
