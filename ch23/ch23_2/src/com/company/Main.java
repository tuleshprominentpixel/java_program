package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    int count = 0;
    public static void main(String[] args) throws Exception {
	// write your code here
        /*int count = 0;

        try {
            // create a new file object
            File file = new File("/home/pp-2/Desktop/java/java_new/file11.txt");



            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println("Total Number of Lines: " + count);

            // close scanner
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }*/
        String maindirpath= "/home/pp-2/Desktop/java/";

        File maindir = new File(maindirpath);

        if (maindir.exists() && maindir.isDirectory()) {

            File arr[] = maindir.listFiles();



            RecursivePrint(arr, 0);
        }
    }
    static void RecursivePrint(File[] arr, int level)
    {
        String dir="";

        for (File f : arr) {

            for (int i = 0; i < level; i++)
                System.out.print("\t");

            if (f.isFile()) {
                int count=0;
                System.out.println(" a1 : " + f.getName());
                try {
                    File file;
                    if(dir=="") {
                         file = new File("/home/pp-2/Desktop/java/" + f.getName());
                    }else {
                         file = new File("/home/pp-2/Desktop/java/"+dir +"/"+ f.getName());
                        System.out.println(file+" file is ");
                        dir="";
                    }



                    Scanner sc = new Scanner(file);

                    while(sc.hasNextLine()) {
                        sc.nextLine();
                        count++;
                    }
                    System.out.println("Total Number of Lines: " + count);

                    // close scanner
                    sc.close();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

            else if (f.isDirectory()) {
                System.out.println("[" + f.getName() + "]");
                dir=f.getName();
//                File file = new File("/home/pp-2/Desktop/java/" + f.getName());
//                RecursivePrint(f.listFiles(),1);
                RecursivePrint(f.listFiles(), level + 1);
            }
        }
    }
}
