package org.example;

import java.util.Random;

import static java.lang.Thread.sleep;

//class MyCounter extends Thread{
//    private int threadNo;
//
//    public MyCounter(int threadNo) {
//        this.threadNo = threadNo;
//    }
//
//    @Override
//    public void run(){
//        try {
//            count();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void count() throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            sleep(500); //slows dows execution
//            System.out.println("Thread: "+threadNo+" Count: "+i);
//        }
//    }
//}

//class MyCounter implements Runnable{
//    private int threadNo;
//
//    public MyCounter(int threadNo) {
//        this.threadNo = threadNo;
//    }
//    @Override
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            try {
//                Random random = new Random();
//                sleep(random.nextInt(1000));
////                sleep(500); //slows dows execution
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Thread: "+threadNo+" Count: "+i);
//        }
//    }
//}
public class Main { //to implement one time thread
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        }).start();



//
//        Thread thread1 = new Thread(new MyCounter(1));
//        Thread thread2 = new Thread(new MyCounter(2));
//        thread1.start();
//        thread2.start();

    }


//    public static void main(String[] args) throws InterruptedException {
//        MyCounter counter1 = new MyCounter(1);
//        MyCounter counter2 = new MyCounter(2);
//        MyCounter counter3 = new MyCounter(3);
//        Long startTime = System.currentTimeMillis();
////        counter1.count();
//        counter1.start();
//        System.out.println("********************");
//        counter2.start();
//        counter3.start();
//        sleep(1000);
//        Long endTime = System.currentTimeMillis();
//        System.out.println("Time taken to handle request: "+(endTime-startTime));
//    }
}