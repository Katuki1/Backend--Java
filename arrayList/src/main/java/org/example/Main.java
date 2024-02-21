package org.example;


import java.util.ArrayList;

class IntWrapper{
    public int numbers;

    public IntWrapper(int numbers) {
        this.numbers = numbers;
    }
    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(Double.valueOf(25.5)); //Autoboxing
        System.out.println(numberList);
        System.out.println(numberList.get(0).doubleValue()); //Unboxing


//        ArrayList<Integer> listOfNumbers = new ArrayList<>();
//        listOfNumbers.add(10); //Autoboxing
//
//        System.out.println(listOfNumbers.get(0)); //Auto Unboxing
//
//        ArrayList<IntWrapper> listOfNumbers2 = new ArrayList<>();
//        listOfNumbers2.add(new IntWrapper(20)); //Boxing
//
//        System.out.println(listOfNumbers2.get(0).getNumbers()); //Unboxing


//        ArrayList<String> listOfNames = new ArrayList<>();
//        listOfNames.add("John"); //autoboxing
//        listOfNames.add("Smith");
//        listOfNames.add("Willy");
//        listOfNames.add("Wonka");
//        listOfNames.add("Jabber");
//        listOfNames.add("Wocky");
//        listOfNames.add("Mine");
//
//        System.out.println(listOfNames.remove(6));
//        System.out.println(listOfNames.get(5));
//        System.out.println(listOfNames.set(5, "Zeze")); //Auto unboxing
//        System.out.println(listOfNames);
//        System.out.println(listOfNames.indexOf("Willy"));
//        System.out.println(listOfNames.size());
//
//        for(String temp:listOfNames){
//            System.out.println(temp);
//        }
    }
}