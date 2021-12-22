package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        FileOutputStream fos = new FileOutputStream("Desk.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Desk desk = new Desk(4, "computer", 15000);
        Desk desk1 = new Desk(6, "computer1", 10000);
        Desk desk2 = new Desk(8, "computer2", 20000);

        oos.writeObject(desk);
        oos.writeObject(desk1);
        oos.writeObject(desk2);

        oos.flush();
        oos.close();

        desk = null;
        FileInputStream fis = new FileInputStream("Desk.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.printf(""+ois.available());
       try {


            while (true) {

                desk = (Desk) ois.readObject();
                System.out.println("Base : " + desk.getbases());
                System.out.println("type : " + desk.gettype());
                System.out.println("price : " + desk.getPrice());
            }
        } catch (IOException e) {
//           e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
