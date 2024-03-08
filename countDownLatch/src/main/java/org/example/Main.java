package org.example;


import java.util.concurrent.CountDownLatch;

class Threads extends Thread{
    private CountDownLatch latch;

    public Threads(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started Thread: "+ Thread.currentThread().getName());
        System.out.println("Ended Thread: "+ Thread.currentThread().getName());
        System.out.println("*****************");
        latch.countDown();
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
        Threads thread1 = new Threads(latch);
        Threads thread2 = new Threads(latch);
        Threads thread3 = new Threads(latch);
        Threads thread4 = new Threads(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        latch.await();
        System.out.println("Main thread: "+Thread.currentThread().getName());

    }
}