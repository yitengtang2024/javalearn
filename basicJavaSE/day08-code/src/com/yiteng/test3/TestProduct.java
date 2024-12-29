package com.yiteng.test3;

public class TestProduct {
    public static void main(String[] args) {
        Product[] arr = new Product[3];
        Product p1 = new Product("001","iPhone13",999.99,200);
        Product p2 = new Product("002","iPhone14",1099.99,200);
        Product p3 = new Product("003","iPhone15",1199.99,200);

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        for (Product product : arr) {
            System.out.println(product.toString());

        }
    }
}
