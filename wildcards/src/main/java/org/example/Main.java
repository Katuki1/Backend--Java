package org.example;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int id;

    public Vehicle(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                '}';
    }
}
class Car extends Vehicle{
    private String model;

    public Car(int id, String model) {
        super(id);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(1));
        list.add(new Vehicle(2));
        list.add(new Vehicle(3));
        list.add(new Vehicle(4));
        list.add(new Car(5, "A13"));
        Main.display(list);

//        System.out.println(list);

//        for (Vehicle listing: list){
//            System.out.println(listing);
//        }

    }
//wildcard(<?>) allows for any class to be called
    public static void display(List <? extends  Vehicle> list) { // upperbound Vehicle as the parent
//    public static void display(List list) {
//        for (Object data:list){
        for (Vehicle data:list){ // type vehicle
            System.out.println(data);
        }
    }
}