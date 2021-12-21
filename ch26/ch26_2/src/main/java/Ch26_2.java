import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Ch26_2 {
    public static void main(String[] args) throws IOException {

        /*String file = "/home/pp-2/Desktop/java/input.txt";
        BufferedReader scan = new BufferedReader(new FileReader(file));

        String str[] = scan.readLine().split(" ");
        int n =Integer.parseInt(str[0]);

        int k = Integer.parseInt(str[1]);

        int[] row = new int[n];

        int[] col = new int[n];

        long rs = row.length;

        long cs = col.length;



        while(k-- > 0) {

            int i = Integer.parseInt(str[0]);

            int j = Integer.parseInt(str[1]);

            if(row[i - 1] == 0) {

                row[i - 1] = 1;

                --rs;

            }



            if(col[j - 1] == 0) {

                col[j - 1] = 1;

                --cs;

            }

            System.out.print(rs * cs + " ");
            System.out.println("cs: "+cs+ " rs : "+rs);

        }*/

        String file = "/home/pp-2/Desktop/java/input.txt";
        BufferedReader scan = new BufferedReader(new FileReader(file));
        String str[] = scan.readLine().split(" ");
        int iOfRow = Integer.parseInt(str[0]);
        int jOfRow = Integer.parseInt(str[1]);

        StringBuilder out = new StringBuilder();
        long tot = (long) iOfRow * (long) iOfRow;
        boolean row[] = new boolean[iOfRow + 1];
        boolean col[] = new boolean[iOfRow + 1];
        int temp1 = 0;
        int temp2 = 0;

        while (true) {
            if (jOfRow-- <= 0) break;
            String s[] = scan.readLine().split(" ");
            int i = Integer.parseInt(s[0]);
            int j = Integer.parseInt(s[1]);
            if (!row[i]) {
                temp1++;
                row[i] = true;
            }
            if (!col[j]) {
                temp2++;
                col[j] = true;
            }
            long ans1 = (long) temp1 * (long) iOfRow;
            long ans2 = (long) temp2 * (long) iOfRow;
            long ans3 = (long) temp1 * (long) temp2;
            long ans = tot - (ans1 + ans2 - ans3);
            out.append(ans);
            out.append(" ");
        }
        System.out.println(out);
        try {
            FileWriter fw = new FileWriter("/home/pp-2/Desktop/java/output.txt");
            fw.write(String.valueOf(out));
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
