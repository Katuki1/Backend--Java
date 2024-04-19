package org.example;

import java.io.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("Enter some letters: ");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            isr.close();
//            System.out.println();
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

        try(FileReader fr = new FileReader("notes.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.print((char) letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }


//        BufferedReader br = new BufferedReader(Reader.in);
//        BufferedReader br = new BufferedReader(new FileReader(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try(
        //ISR converts byte to char stream for BR to read
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            System.out.println("You typed: "+ br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }

        try(BufferedReader br = new BufferedReader(new FileReader("notes.txt"))){
            System.out.println("You typed: "+ br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }
    }
}