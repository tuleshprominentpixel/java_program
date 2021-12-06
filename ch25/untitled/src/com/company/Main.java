package com.company;
import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        ServerSocket ss=new ServerSocket(2000);
        Socket stk=ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do {
            msg=br.readLine();
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);

        }while (msg.equals("dne"));


    }
}
class Client {

    public static void main(String[] args) throws Exception {
	// write your code here
        Socket stk=new Socket("localhost",2000);

        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;
        do {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.printf("message "+msg);

        }while (!msg.equals("dne"));

        stk.close();
    }
}
