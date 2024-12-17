package com.yiteng.search;

public class A03_FibonacciSearchDemo1 {

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,8,13,21,34,55};
       int target = 21;

       int result = fibonacci(arr, target);
        System.out.println(result);
    }

    private static int fibonacci(int[] arr, int target) {
        int n = arr.length;
        int fib2 = 0;
        int fib1 = 1;
        int fib = fib1+ fib2;
        while(fib< arr.length){
            fib2 = fib1;
            fib1 = fib;
            fib = fib1+fib2;
        }

        int offset = -1;

        while(fib >1){
            int i = Math.min(offset + fib2, n-1);

            if(arr[i] < target){
                fib = fib1;
                fib1 = fib2;
                fib2 = fib -fib1;
                offset = i;
            }
            else if(arr[i] > target){
                fib = fib2;
                fib1 = fib1 - fib2;
                fib2 = fib -fib1;
            }
            else{
                return i;
            }
        }

        if (fib1 == 1 && arr[offset+1] == target){
            return offset+1;
        }
        return -1;
    }


}
