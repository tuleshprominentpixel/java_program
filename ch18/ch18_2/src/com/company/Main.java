package com.company;
import java.io.FileOutputStream;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        String character;

//        try(FileOutputStream fileOutputStream =new FileOutputStream("test1.txt"))
        try(BufferedReader br = new BufferedReader(new FileReader("test1.txt"))) {
            while ((character = br.readLine()) != null) {
                System.out.println("File detail is : "+character);
            }
        } catch (Exception e) {
            System.out.println("Error in file reading" + e.getMessage());
        }

    }

}
