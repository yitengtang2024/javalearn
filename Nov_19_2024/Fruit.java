/*
 * rewrite the toString()
 * it will return the purchase value of apple
 * every 500g is 4.98
 * purchase 2500 g
 */

public class Fruit{
    protected String name;
    private double price;
    private int weight;

    public Fruit( String name, double price, int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
    public double calculateTotalPrice(){
        return price*weight;
    }
    @Override
    public String toString(){
        return name +"total price:" + calculateTotalPrice() +"dollor";
    }
}
class PackedFruit extends Fruit{
    double packagingFee;

    public PackedFruit( String name, double price, int weight, double packagingFee){
        super(name,price,weight);
        this.packagingFee=packagingFee;
    }
    @Override
    public double calculateTotalPrice(){
        return super.calculateTotalPrice() +packagingFee;
    } 
    @Override
    public String toString(){
        return name +"package price:" +calculateTotalPrice() +"dollor";
    }
}
