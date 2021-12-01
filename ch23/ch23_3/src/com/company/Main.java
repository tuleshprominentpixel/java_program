package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        File file = new File("/home/pp-2/Desktop/java/gtr.txt");//This is use for create a new file.
        file.createNewFile();
        FileInputStream fis=new FileInputStream("/home/pp-2/Desktop/java/gtr.txt");//open any file
        BufferedReader br=new BufferedReader(new FileReader("/home/pp-2/Desktop/java/gtr.txt"));//open any file
        /*-----------Reading to a file--*/
        FileReader fr=new FileReader("/home/pp-2/Desktop/java/gtr.txt");
        int r=0;
        while((r=fr.read())!=-1)
        {
            System.out.print((char)r);  //prints the content of the file
        }
        /*-----------Writing to a file--*/

        FileWriter myWriter = new FileWriter("/home/pp-2/Desktop/java/gtr.txt");
        myWriter.write("Anyfile Notepad is a text editor that lets. you open any type of files on Google Drive and Dropbox.");
        myWriter.close();//close file
        /*---------Moving to a specific location in a file--*/
        /*if(file.renameTo(new File("/home/pp-2/Desktop/java/java_new/gtr.txt")))
        {
            // if file copied successfully then delete the original file
            file.delete();
            System.out.println("File moved successfully");
        }*/
        String[] entries="\u0645 \u062E\u062F\u0627".split("#");
        /*OutputStream os = new FileOutputStream("/home/pp-2/Desktop/java/j.csv");
        os.write(239);
        os.write(187);
        os.write(191);*/
    }
}
