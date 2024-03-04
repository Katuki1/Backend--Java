package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.add(25);
        numbers.add(10);
        numbers.add(2);
        numbers.add(225);
        //Last In First Out (LIFO)
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.search(2));
        System.out.println(numbers.pop());
        System.out.println(numbers.peek());
        System.out.println(numbers.push(67));
    }
}