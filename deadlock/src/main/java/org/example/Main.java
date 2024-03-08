package org.example;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Main {
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                while (true) {
                    try {
                        flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
                        flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        if (flagLock1) {
                            System.out.println("Thread1, Lock1");
                            lock1.unlock();
                        }
                        if (flagLock2) {
                            System.out.println("Thread1, Lock2");
                            lock2.unlock();
                        }
                        if (flagLock1 && flagLock2) {
                            break;
                        }
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                while (true) {
                    try {
                        flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
                        flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        if (flagLock2) {
                            System.out.println("Thread2, Lock2");
                            lock2.unlock();
                        }
                        if (flagLock1) {
                            System.out.println("Thread2, Lock1");
                            lock1.unlock();
                        }
                        if (flagLock1 && flagLock2) {
                            break;
                        }
                    }
                }
            }
        });

    }



//    public static void main(String[] args) throws InterruptedException {
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lock1.lock();
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Thread1, Lock1");
//                lock2.lock();
//                System.out.println("Thread1, lock2");
//                lock2.unlock();
//                lock1.unlock();
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lock2.lock();
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Thread2, Lock2");
//                lock1.lock();
//                System.out.println("Thread2, lock1");
//                lock1.unlock();
//                lock2.unlock();
//
//            }
//        });
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println("Main thread "+Thread.currentThread().getName());
//    }
//    public static void main(String[] args) throws InterruptedException {
//        //simulating deadlock state
//        String lock1 = "lock1";
//        String lock2 = "lock2";
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (lock1){
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Thread1, Lock1");
//                    synchronized (lock2){
//                        System.out.println("Thread1, Lock2");
//                    }
//                }
//
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (lock2){
//                    System.out.println("Thread2, Lock2");
//                    synchronized (lock1){
//                        System.out.println("Thread2, Lock1");
//                    }
//                }
//
//            }
//        });
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println("Main thread "+Thread.currentThread().getName());
//
//    }

}