package org.example;

public class Main {
    public static void main(String[] args) {
        // convert object to json
        Object object = new Object();
        Employee e1 = new Employee(1, "Faith");
        String jsonData = object.toString();
        System.out.println(e1);

    }
}

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}