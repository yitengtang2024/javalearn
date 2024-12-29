/*
 * build a simple calculator
 * this will include plus, minus, divide, and multiply
 */

public class Calculator{
//plus
    public static double add(double a, double b){
        return a + b;
    }
    public static double minus(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;

    }
    public static double divide(double a,double b){
        if (b == 0){
            System.out.println("b cannot be 0!");
            return 0;
        }else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        System.out.println("the plus results is "+ add(0.2,0.8));
        System.out.println("the minus results is "+ minus(0.2, 0.8));
        System.out.println("the multiply results is  "+ multiply(0.2, 0.8));
        System.out.println("the divde reslts is  "+ divide(0.2, 0.8));
    }
}
