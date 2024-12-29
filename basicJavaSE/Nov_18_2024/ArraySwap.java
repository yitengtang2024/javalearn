/*
 initial conditions:
 swap the arr element:
 swap element 1 and 3, 2 and 4 then print it out the arr
 */
public class ArraySwap{
    public static void main(String[] args) {
        
        int[] a = {1,3,5,7};

        int temp=a[0];
        a[0]= a[2];
        a[2]=temp;

        temp =a[1];
        a[1]= a[3];
        a[3]= a[1];

        System.out.println("the arr after swap is:");
        for (int num: a){
        System.out.print(num+ " ");
        }
        
        
    }
}
