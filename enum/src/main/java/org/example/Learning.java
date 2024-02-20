package org.example;

public enum Learning {
//    COREJAVA, COLLECTIONS, GENERIC, JSP, MULTIREADING

    //assigning variables to enum
    COREJAVA(10), COLLECTIONS(20), GENERIC(30), JSP(40), MULTIREADING(50);

    private int i;

    //constructor
    Learning(int i) {
        this.i = i;
    }

    //getter
    public int getI() {
        return i;
    }
}
