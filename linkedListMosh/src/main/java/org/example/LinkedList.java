package org.example;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty(){
        return first == null;
    }


    //addFirst
    public void adddFirst(int item){
        var node = new Node(item);

        //check if list is empty
        if(isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
    }

    //addLast
    public void addLAst(int item){
        var node = new Node(item);

        //check if list is empty or not
        if(isEmpty()){
            first = last = node;
        }
        else{  //list not empty
            last.next = node; //store in next node after last
            last = node;  // make it last node
        }

    }

    //deleteFirst
    public void removeFirst(){
        //[10 -> 20 -> 30]
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
            return;
        }

        var second = first.next; // store second node
        first.next = null;  // remove link btw first and second
        first = second;  // set second value to first
    }

    //deleteLast
    //[10 -> 20 -> 30]
    //last -> 30
    // find previous node - second last
    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node) return current;
            current = current.next;

        }
        return null;
    }

    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    //indexOf
    public int indexOf (int item){
        int index = 0;
        var current = first;
        while(current != null){
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return  -1;
    }
}
