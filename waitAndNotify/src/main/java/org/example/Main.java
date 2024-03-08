package org.example;


public class Main {
    public static int balance = 0;
//        synchronized public void withdraw(int amount) throws InterruptedException {
        synchronized public void withdraw(int amount) {
            if (balance<= 0){
                System.out.println("Waiting for withdrawal of "+ amount +" to be updated ");
                try {
//                    wait(3000);
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Withdrawal interrupted");
                    return;
                }
            }
            if((balance-amount)<=0){
                System.out.println("Balance too low for withdrawal");
                System.out.println("Withdrawal incomplete");
                return;
            }
            balance = balance - amount;
            System.out.println("Account balance after withdrawal is $"+balance);
        }
        public boolean deposit(int amount) {
            synchronized (this){
                if (amount > 0){
                    System.out.println("New balance after deposit is $" + amount);
                    balance = balance + amount;
                    notify();
                    return true;
                }else {
                    System.out.println("Invalid amount");
                    return false;
                }
             }
        }

    public static void main(String[] args) {
            Main main = new Main();
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    main.withdraw(1000);
                }
            });
            thread2.setName("Thread 2");
            thread2.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(main.deposit(2000)){
                    System.out.println("Deposit transaction completed");
                }else{
                    thread2.interrupt();
                }
            }
        });
        thread1.setName("Thread 1");
        thread1.start();

    }
}