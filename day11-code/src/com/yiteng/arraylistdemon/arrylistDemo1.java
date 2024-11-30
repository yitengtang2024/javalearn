package com.yiteng.arraylistdemon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrylistDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("This is the first code");
        arrayList.add("This is the second code");
        arrayList.add("This is the third code");

        //1. using for loop
        System.out.println("This is the for loop the arraylist");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //2.using enhanced for loop
        System.out.println("This is the enhanced for loop for arraylist");
        for(String element : arrayList) {
            System.out.println(element);
        }
        //3.using iterator andi it can do more complex operation such as removing elements during iteration
        System.out.println("This is the print of iterator method");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //4.Using listiterator, it allows both forward and backward traversal
        ListIterator<String> listIterator = arrayList.listIterator();
        //forward
        System.out.println("This is the forward iterator");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //backward
        System.out.println("This is the back iterator");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        //5. using foreach method lambda
        System.out.println("This is the result of foreach method from lambda");
        arrayList.forEach(element -> System.out.println(element));

        //6. using stream
        System.out.println("This is the results from the stream method");
        arrayList.forEach(System.out::println);
    }

}
