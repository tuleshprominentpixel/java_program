package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner sc = new Scanner(new BufferedReader(new FileReader("/home/pp-2/Downloads/file1.txt")));
        int rows = 15;
        int columns = 2;
        int [][] myArray = new int[rows][columns];
        while(sc.hasNextLine()) {
            for (int i=0; i<myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j=0; j<line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(myArray));

        emptyCells(15,10,myArray);


        /*BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String str[]=scan.readLine().split(" ");
        int N=3;
        int K=5;
        StringBuilder out=new StringBuilder();
        long tot=(long)N*(long)N;
        boolean row[]=new boolean[N+1];
        boolean col[]=new boolean[N+1];
        int cnt1=0;
        int cnt2=0;
        while(K-->0){
            ///home/pp-2/Downloads/file1.txt
//            String s[]=new String[500];
            String s[]=scan.readLine().split(" ");
            int i=1;
            int j=3;
//            int j=Integer.parseInt(s[1]);
            if(!row[i]){
                cnt1++;
                row[i]=true;
            }
            if(!col[j]){
                cnt2++;
                col[j]=true;
            }
            long ans1=(long)cnt1*(long)N;
            long ans2=(long)cnt2*(long)N;
            long ans3=(long)cnt1*(long)cnt2;
            long ans=tot-(ans1+ans2-ans3);
            out.append(ans);
            out.append(" ");
        }
        System.out.println(out);*/

    }
    public static long[] emptyCells(int n, int k, int[][] tasks) {

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        long[] ans = new long[k];

        for (int i = 0; i < k; i++) {
            int x = tasks[i][0];
            int y = tasks[i][1];

            for (int j = 0; j < n; j++) {
                matrix[x][j] = 0;
                matrix[j][y] = 0;
            }

            long count = 0;
            for (int j = 0; j < n; j++) {
                for (int p = 0; p < n; p++) {
                    if (matrix[j][p] == -1) {
                        count++;
                    }
                }
            }

            ans[i] = count;
        }
        System.out.println(ans.length);
        return ans;
    }
}
