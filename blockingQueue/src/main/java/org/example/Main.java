package org.example;


import java.util.concurrent.ArrayBlockingQueue;

class Producer extends  Thread{
    private ArrayBlockingQueue queue;

    public Producer(ArrayBlockingQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500); //adds to the queue faster
                queue.put(Main.counter);
                System.out.println("Value added to queue: "+Main.counter);
                Main.counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer extends  Thread{
    private ArrayBlockingQueue queue;

    public Consumer(ArrayBlockingQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000); //takes from the queue slower
                queue.take();
                System.out.println("Value removed from the queue: "+Main.counter);
                Main.counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static int counter = 1;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue1 = new ArrayBlockingQueue<>(10);
        Thread thread1 = new Thread(new Producer(queue1));
        thread1.start();

         Thread thread2 = new Thread(new Consumer(queue1));
         thread2.start();

    }
}