package OverLoadTest;
import java.util.Scanner;

public class BuyCar{
  private static final int PRICE_PER_ITEM = 580;

  public int pay(int quantity){
    return PRICE_PER_ITEM*quantity;
  }
  public int pay(int quantity, boolean discount){
    if(discount && quantity >2){
      return (int) (PRICE_PER_ITEM*0.92);
    }else{
      return PRICE_PER_ITEM*quantity;
    }
  }
  public static void main(String[] args) {
    BuyCar car = new BuyCar();
    Scanner scanner=new Scanner(System.in);

    System.out.println("How many items you want to buy:");
    int quantity=scanner.nextInt();
    scanner.close();

    if(quantity>2){
      System.out.println("Pay:"+car.pay(quantity,true));
    }else{
      System.out.println("Pay:"+car.pay(quantity));
    }
  }
}
