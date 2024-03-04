package org.example;
//  K - Key
//  V - Value
//  E - Element
//  N - Number
//  T - Type

class Data<K extends Integer, V extends Name>{
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
    public <E, N extends Number> void display(E element, N number ){
        System.out.println("Element: "+ element+" Number: "+number);
    }
}
class Name{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Data <Integer, Name> data = new Data<>(10, new Name("Mine"));
 //       Data <Integer, String> data = new Data(10, "Mine");
        System.out.println("Key: "+ data.getKey()+ " and Value: "+data.getValue());
//        System.out.println(data);

        data.display(20, 25);
    }
}