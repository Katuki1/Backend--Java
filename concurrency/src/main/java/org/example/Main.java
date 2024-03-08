package org.example;


public class Main {
    public static int counter1 = 0;
    public static int counter2 = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter1++;
                }

            }
        });
           thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter2++;
                }
            }
        });
       thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();//waits for thread to complete
                    thread2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Counter1: "+counter1);
                System.out.println("Counter2: "+counter2);

            }
        });
       thread3.start();

//           thread1.join(); // adds sychronization to main thread and thread1
        System.out.println("Main thread: "+Thread.currentThread().getName());
    }
}