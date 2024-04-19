package org.example;


public class Main {
    public static void main(String[] args) {

        var list = new LinkedList();
        list.addLAst(10);
        list.addLAst(20);
        list.addLAst(30);
        list.removeLast();
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(40));

    }
}