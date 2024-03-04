package org.example;

import java.util.*;

class Data< K extends Integer, V extends  String>{ //Bound data type
//class Data< K, V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Comparator for treeset to sort with
        Comparator <Data<Integer, String>> COMPARE_KEY =
                new Comparator<Data<Integer, String>>() {
                    @Override
                    public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                       if(obj1.getKey() > obj2.getKey()){
                           return -1;
                       }
                       else if (obj1.getKey() < obj2.getKey()){
                           return 1;
                       }else
                        return 0;
                    }
                };

        Set<Data<Integer, String>> set = new TreeSet<>();
//        Set<Data<Integer, String>> set = new HashSet<>();
        set.add(new Data<>(1, "Kigen"));
        set.add(new Data<>(2, "Regina"));
        set.add(new Data<>(3, "Billy"));
        set.add(new Data<>(4, "Dennis"));
        set.add(new Data<>(5, "Lydia"));
//        System.out.println(set);
        for (Data data:set){
            System.out.println(data);
        }
    }
    }

//public class Main {
//    public static void main(String[] args) {
//        Set set = new HashSet();
////        Set set = new LinkedHashSet();
////        Set set = new TreeSet();
//            for(int i = 30; i>=0; i--){
//                set.add("A"+ i);
//            }
//        System.out.println(set);
//
////        Set<String> set = new HashSet<>();
////        set.add("Mine");
////        set.add("Mine");
////        set.add("mine");
////        set.add("mime");
////       // System.out.println(set);
////     for(String names: set){
////         System.out.println(names);
////        }
////        System.out.println(set.contains("Z"));
//
//    }
//}