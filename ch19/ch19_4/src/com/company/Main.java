package com.company;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String dirpath
                = "/home/pp-2/Desktop/java";

        File directoryname = new File(dirpath);

        if (directoryname.exists() && directoryname.isDirectory()) {
            File arr[] = directoryname.listFiles();

            printNumberOfLine(arr, 0);
        }

    }
    static void printNumberOfLine(File[] arr, int level)
    {
//        Path file = Paths.get("D:/prominent_pixel/git/");
        for (File f : arr) {
            for (int i = 0; i < level; i++)
                System.out.print("\t");

            if (f.isFile())
            {
                System.out.println(f.getName());
                String s1=f.getName();
                try {

//             file = file+s1;
                    Path file = Paths.get("/home/pp-2/Desktop/java/"+f.getName());

                    long count = Files.lines(file).count();
                    System.out.println("Total Lines: " + count);

                } catch (Exception e) {
                    e.getStackTrace();
                }
            }

            else if (f.isDirectory()) {
                System.out.println("[" + f.getName() + "]");

                printNumberOfLine(f.listFiles(), level + 1);
            }
        }
    }

}
