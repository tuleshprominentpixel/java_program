package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws  Exception {
	// write your code here
        FileOutputStream fos = new FileOutputStream("Desk.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Desk desk=new Desk(4,"computer",15000);

        oos.writeObject(desk);

        oos.flush();
        oos.close();

        desk=null;
        FileInputStream fis=new FileInputStream("Desk.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        desk=(Desk)ois.readObject();

        System.out.println("Base : "+desk.getbases());
        System.out.println("type : "+desk.gettype());
        System.out.println("price : "+desk.getPrice());
    }
}
