package com.company;
class Mythread extends Thread{
    public void run(){
        int i=1;
        for(;;){
            System.out.println(i+" hello ");
            i++;
        }
    }
}
class myRunnbale implements Runnable{
    public void run(){
        int i=1;
        for(;;){
            System.out.println(i+" hello ");
            i++;
        }
    }
}
public class Main
{
    public void run(){
        int i=1;
        for(;;){
            System.out.println(i+" hello ");
            i++;
        }
    }
    public static void main(String[] args) {
	// write your code here
        myRunnbale m=new myRunnbale();
        Thread t=new Thread(m);
        t.start();
        int j=0;
        for (;;){
            System.out.println(j+" World");
            j++;
        }
    }
}
