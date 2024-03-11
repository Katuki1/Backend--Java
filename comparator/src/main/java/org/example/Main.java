package org.example;

import java.util.*;

//class Data{
//    private String name;
//
//    public Data(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Data{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}

// lambda refresher course
interface Data{
    public int demo(int a, String name);
}

public class Main {
    //for each loop
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32,4,43,12,5,7,12);
        list.forEach(i -> System.out.println(i));
    }

//    // lambda refresher course
//    public static void main(String[] args) {
//        int x = 25;
//        Data data = (a, name)-> { //optional defining data type
//            System.out.println("Position: "+a);
//            System.out.println("Student: "+name);
//            return a;
//        };
//        System.out.println(data.demo(01, "Z"));
//    }


//    public static void main(String[] args) {
//        List<Data> list = new ArrayList<>();
//        list.add(new Data("Chaand"));
//        list.add(new Data("Z"));
//        list.add(new Data("Faith"));
//        list.add(new Data("Abby"));
//
//        //sorts the list in alphabetic order
////        Collections.sort(list, new Comparator<Data>() {
////            @Override
////            public int compare(Data o1, Data o2) {
////                return o1.getName().compareTo(o2.getName());
////            }
////        });
//
//        //implementing lambda
////        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//
//        //sort with length of string
//        Collections.sort(list, (o1, o2) -> {
//           if (o1.getName().length() < o2.getName().length()){
//               return -1;
//           }else if(o1.getName().length() > o2.getName().length()){
//               return 1;
//           }else{
//               return 0;
//           }
//        });
//
//
//        for (Data temp:list){
//            System.out.println(temp);
//        }
//    }
}