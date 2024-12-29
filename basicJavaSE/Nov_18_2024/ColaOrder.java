/*
 initial of this project:
 Zhang went to KFC, the defaul of drink is adding 1 ice. 
 Zhang requested to add 3 ice.
 */
public class ColaOrder{
    private int iceCubes;
    public ColaOrder(){
        this.iceCubes = 1;
    }

    public ColaOrder(int iceCubes){
        if (iceCubes==3){
            this.iceCubes = iceCubes;
        }else{
            this.iceCubes = 1;
        }
        
    }
    public void printOrder(){
        System.out.println("Cola will add" + iceCubes +" iceCubes.");
    }
    public static void main(String[] args) {
        ColaOrder defaultOrder = new ColaOrder();
        defaultOrder.printOrder();

        ColaOrder customerOrder = new ColaOrder(3);
        customerOrder.printOrder();
    }
    
}
