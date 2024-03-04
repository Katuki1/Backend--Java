package org.example;


import java.util.LinkedList;
import java.util.List;

class Data<T>{
    private T object;

    public Data(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
class Name{
    private String names;

    public Name(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return names;
    }
}
class GenericData<T>{
    private T data;

    public GenericData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) {
//        GenericData genericData = new GenericData("Chaand");
 //       String y = (String)genericData.getData();

//        GenericData<String> genericData = new GenericData<String>("Chaand");
//        String y = genericData.getData();
//        System.out.println(y);


//        Data data = new Data("Mine");
//        String x = data.getObject().toString();
//        System.out.println(x);


        List<Data<String>> elements = new LinkedList<>();
        elements.add(new Data<>("Chaaand"));
//        elements.add(new Data<>(25.61));
//        elements.add(new Data<>(30));
//        elements.add(new Data<>('E'));
        elements.add(new Data<>("studyEasy"));
        System.out.println(elements);

        for (Data<String> data:elements){
            System.out.println(data);
        }
//        for (String data:elements){
//            System.out.println(data);
//        }
//        Data x = new Data("Hello World");
//        System.out.println(x);

    }
}