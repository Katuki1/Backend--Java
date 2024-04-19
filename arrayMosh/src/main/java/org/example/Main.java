package org.example;


import java.util.ArrayList;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        System.out.println(numbers.indexOf(200));
//        numbers.removeAt(3);
        numbers.print();



//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//        numbers.add(50);
//        System.out.println(numbers.indexOf(40));
//        numbers.remove(1);
//        System.out.println(numbers);



//        int [] numbers = {10, 20, 30, 40};
//        System.out.println(numbers.length);
//        int [] numbers = new int [3];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers);
    }
}