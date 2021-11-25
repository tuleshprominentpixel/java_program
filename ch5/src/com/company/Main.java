package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num=9,start;
        double print1;
        Scanner sc=new Scanner(System. in);
        System.out.println("Enter value :");
        num=sc.nextInt();
        System.out.println("num ");
        if(num%2==0){
            System.out.println("Please enter odd number");
            return;
        }
        start=num/2;
        print1 = Math.ceil(num/2)+1;
        for(int i=1;i<num+1;i++){
            System.out.print("*");
            for (int j=0;j<(num);j++) {
                if(j<(print1)&&(i<num/2+2)) {
                    if ((num / 2) >= i ) {
                        for (int k = 0; k < start; k++) {
                            System.out.print(" ");
                        }
                        start = 0;
                        System.out.print("*");
                    } else {

                        System.out.print("*");
                    }
                }
                else
                {
                    if ((num / 2) < i ) {
                        for (int k = 0; k < start; k++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < start; k++) {
                            System.out.print("*");
                            if(k==start-1){
                                System.out.print("*");
                            }
                        }
                        start = 0;
//                        System.out.print("*");
                    }
//                    System.out.print("*");
                }
            } print1--;
            if((num/2)>i-1)
            {
                start = (num / 2) - i;
                if(Math.round(num / 2)==i){
//                    start=2;
                }
            }
            else
            {
                start=  i-(num/2);
            }
            System.out.println("");
        }


        /*for (int i = 9; i > 0; i--) // define the outer loop
        {
            for (int j = i; j > 4; j--) // define the inner loop
            {
                if((num/2)>=i-1) {
                    for (int k = 0; k < start; k++) {
                        System.out.print("_");
                    }
                    start = 0;
                    System.out.print("*");
                }
            }
            print1--;
            if((num/2)>=i-1)
            {
                start = (num / 2) - i;
            }
            else
            {
                start= (num / 2) + 3;
            }
            System.out.println("");
        }*/
    }
}
