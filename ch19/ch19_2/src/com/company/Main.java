package com.company;


class OddThread extends Thread {

    private int max;
    private Printer print;

    OddThread(Printer print, int max) {
        this.print = print;
        this.max = max;
    }

    @Override
    public void run() {

        int number =  1;
        while (number <= max) {

                print.printOdd(number);

            number += 2;
        }

    }

}


class EvenThread  implements Runnable{
    private int max;
    private Printer print;

    EvenThread(Printer print, int max) {
        this.print = print;
        this.max = max;
    }

    @Override
    public void run() {
        int number = 2;
        while (number <= max) {
            print.printEven(number);
            number += 2;
        }

    }
}

class Printer {

    boolean isOdd = false;

    synchronized void printEven(int number) {

        while (isOdd == false)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:" + number);
        isOdd = true;
        notifyAll();
    }

}

public class Main {

    public static void main(String[] args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new EvenThread(print, 1000));

        OddThread t2=new OddThread(print, 1000);

        t1.start();
        t2.start();
    }
}
