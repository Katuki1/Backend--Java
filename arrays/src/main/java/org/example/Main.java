package org.example;

public class Main {
    public static void main(String[] args) {

//        String[] names = {"John", "Smith"};

        String[] names;
        names = new String[5];
        names[0] = "John";
        names[1] = "Smith";
        names[2] = "Willy";
        names[3] = "Wonka";

        Main main = new Main();
        main.displayNames(names);
        System.out.println("new value: "+ names[1]);

        //to pass each item in array- for each loop
//        for(String name: names) {
//            System.out.println(name);
//        }

//        int[] arrayInt = {1,2};
//        int i;
//
//        for(i=0;i<=arrayInt.length;i++) {
//
//            System.out.println(arrayInt[i]);
//        }

    }

    //call by reference
    void displayNames (String[] names){
        System.out.println("old value: " +names[1]);
        names[1] = "Luka";
    }
}