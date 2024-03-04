package org.example;


import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);
//        Queue<Integer> queue = new LinkedBlockingQueue<>();
        try {
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            queue.add(4);
            queue.add(5);
            System.out.println(queue);
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}