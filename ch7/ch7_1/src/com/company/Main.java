package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{4,4,4},{5,5,5},{6,6,6}};
        int c[][]=new int[3][3];

        System.out.println("First Array");
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Second Array");
        for(int i=0;i<b.length;i++){

            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Muliplication of Two array :");
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){

                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
