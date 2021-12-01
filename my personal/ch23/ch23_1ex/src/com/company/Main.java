package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here.
        FileInputStream fis=new FileInputStream("/home/pp-2/file1.txt");
        FileOutputStream fos=new FileOutputStream("/home/pp-2/file2.txt");

        int b;
        while ((b=fis.read())!=-1){
            if(b>=65 && b<=90){
                fos.write(b+32);
            }else {
                fos.write(b);
            }

        }
        fis.close();
        fos.close();

    }
}
