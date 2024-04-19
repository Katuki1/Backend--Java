package org.example;

public class Array {

    private int[] items;
    private int count; //index of last element in array

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        //If array is full, resize it
        if(items.length == count){ // full array
            // create a new array(twice the size)
            int[] newItems = new int[count * 2];

            //copy all existing items into new array
            for (int i = 0; i<count; i++)
                newItems[i] = items[i];

            //set 'items' to this new array
            items = newItems;
        }

        //Add new items at the end of array
        items[count++] = item;
//        items[count] = item;
//        count++;
    }

    public void removeAt(int index){
        //Validate index
        if(index<0 || index>=count){
            throw new IllegalArgumentException();
        }

        //Shift items to left to fill the empty index
        for (int i = index; i <count; i++)
            items[i] = items[i + 1];

        //shrink the loop after moving items
        count --;
    }

    public int indexOf(int item){
        //runTime complexity O(n)
        //loop throu array, if present return index
        //else return -1
        for(int i = 0; i<count; i++)
            if(items[i] == item)
                return i;

        return -1;

    }

    public void print(){
//        for (int i = 0; i<items.length; i++)
        for (int i = 0; i<count; i++)
        System.out.println(items[i]);
    }

}
