package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Threads extends Thread{
    private String name;

    public Threads(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Started thread: "+name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ended thread: "+name);
    }
}
public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Threads threads01 = new Threads("Thread01");
        Threads threads02 = new Threads("Thread02");
        Threads threads03 = new Threads("Thread03");
        Threads threads04 = new Threads("Thread04");
        Threads threads05 = new Threads("Thread05");
        Threads threads06 = new Threads("Thread06");
        Threads threads07 = new Threads("Thread07");
        Threads threads08 = new Threads("Thread08");
        Threads threads09 = new Threads("Thread09");
        Threads threads10 = new Threads("Thread10");
        Threads threads11 = new Threads("Thread11");
        Threads threads12 = new Threads("Thread12");
        Threads threads13 = new Threads("Thread13");
        Threads threads14 = new Threads("Thread14");
        Threads threads15 = new Threads("Thread15");

        executorService.execute(threads01);
        executorService.execute(threads02);
        executorService.execute(threads03);
        executorService.execute(threads04);
        executorService.execute(threads05);
        executorService.execute(threads06);
        executorService.execute(threads07);
        executorService.execute(threads08);
        executorService.execute(threads09);
        executorService.execute(threads10);
        executorService.execute(threads11);
        executorService.execute(threads12);
        executorService.execute(threads13);
        executorService.execute(threads14);
        executorService.execute(threads15);

        executorService.shutdown(); //terminates the service

        //the start method can be replaced by executor service for thread pool
//        threads01.start();
//        threads02.start();
//        threads03.start();
//        threads04.start();
//        threads05.start();
//        threads06.start();
//        threads07.start();
//        threads08.start();
//        threads09.start();
//        threads10.start();
//        threads11.start();
//        threads12.start();
//        threads13.start();
//        threads14.start();
//        threads15.start();

    }
}