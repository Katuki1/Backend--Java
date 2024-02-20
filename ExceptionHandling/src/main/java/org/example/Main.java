package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int y = 0;
        int x = y;
        try{
            System.out.println("Before exception");
            //x=(10*10)/5;
            x= (y=10*10)/0;
            System.out.println("After after exception");
        }
//        catch(ArithmeticException e){
//            System.out.println("Arithmetic Exception");
//            System.out.println(e);
//        }
//        catch(RuntimeException e) {
//            System.out.println("Runtime Exception");
//        }
//        catch(Exception e){
//            System.out.println("catch exception");
//        }
        finally{
            System.out.println(y);
            System.out.println(x);
        }
    }
}