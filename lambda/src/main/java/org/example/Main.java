package org.example;


//interface Lambda{
//    public void demo();
//}
public class Main {
    public static void main(String[] args) { //introducing lambda for a cleaner code
        Thread thread1 = new Thread(() -> System.out.println("Statement 01"));
        thread1.start();


        //second method
//        Lambda lambda = (()-> {
//            System.out.println("Statement 1");
//            System.out.println("Statement 2");
//        });
//        lambda.demo();

        //first method
//        Lambda lambda = new Lambda() {
//            @Override
//            public void demo() {
//                System.out.println("Statement 1");
//            }
//        };
//        lambda.demo();
   }
}