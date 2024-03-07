package org.example;

class Brackets{
//    private Object lock = "lock"; //better
//    synchronized public void generate() throws InterruptedException{ //good
//    public void generate() throws InterruptedException{ //better
//        synchronized (lock) { // better

    synchronized public static void generate(){ //best
            for (int i = 1; i <= 20; i++) {
                if (i < 10) {
                    System.out.print("{");
                } else {
                    System.out.print("}");
                }
            }
            System.out.println();
        }
    }


public class Main {
    public static void main(String[] args) {
//        Brackets brackets = new Brackets();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 5; i++) {
                    Brackets.generate();
                }
                long stopTime = System.currentTimeMillis();
                System.out.println("Total time taken1: "+(stopTime-startTime));
            }
        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                long startTime = System.currentTimeMillis();
//                for (int i = 0; i < 5; i++) {
//                    try {
//                        brackets.generate();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                long stopTime = System.currentTimeMillis();
//                System.out.println("Total time taken2: "+(stopTime-startTime));
//            }
//        }).start();


        }
 }