package com.company;
import java.util.*;

public class Main {

    static int N = 3;

    static int numberOfCells(int mat[][])
    {
        boolean [][]row = new boolean[N][N];
        boolean [][]col = new boolean[N][N];

        for (int i = 0; i < N; i++)
        {
            for (int j = N - 1; j >= 0; j--)
            {
                if (mat[i][j] == 1)
                {
                    row[i][j] = (j + 1 < N) ? row[i][j + 1]
                            : true;
                }
                else
                {
                    row[i][j] = false;
                }
            }
        }

        for (int j = 0; j < N; j++)
        {
            for (int i = N - 1; i >= 0; i--)
            {
                if (mat[i][j] == 1)
                {
                    col[i][j] = (i + 1 < N) ? col[i + 1][j]
                            : true;
                }
                else
                {
                    col[i][j] = false;
                }
            }
        }
        int cnt = 0;

        for (int i = 0; i < N - 1; i++)
        {
            for (int j = 0; j < N - 1; j++)
            {

                if (row[i][j] && col[i][j])
                {
                    cnt++;
                }
            }
        }
        for (int i = 0; i < N; i++)
        {
            if (col[i][N - 1])
                cnt++;
        }

        for (int j = 0; j < N - 1; j++)
        {
            if (row[N - 1][j])
                cnt++;
        }
        return cnt;
    }


    public static void main(String[] args) {
	// write your code here.
        int mat[][] = { { 0, 1, 1 },
                { 0, 0, 1 },
                { 0, 1, 1 } };

        System.out.print(numberOfCells(mat));

    }
}
