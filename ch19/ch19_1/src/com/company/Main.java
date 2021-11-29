package com.company;
class OddThread extends Thread{

    public void run(){
        int i=1;
        for(i=1;i<=1000;i=i+2){
            System.out.println(i+" OddThread ");

        }
    }
}
class EvenThread implements Runnable{

    public void run(){
        int i=1;
        for(i=2;i<=1000;i=i+2){
            System.out.println(i+" EvenThread ");


        }
    }
}
public class Main
{
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        OddThread ot=new OddThread();
        ot.start();
        ot.join();

        EvenThread m=new EvenThread();
        Thread t=new Thread(m);
        t.start();
        t.join();



    }
}
