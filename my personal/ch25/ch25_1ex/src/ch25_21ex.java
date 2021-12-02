import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ch25_21ex {
    public static void main(String[] args) throws Exception {
//        String data="name=Tulesh address=rajkot country=india dept=cse";
        FileInputStream fis=new FileInputStream("/home/pp-2/Desktop/java/data.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);



        StringTokenizer stk=new StringTokenizer(data,"=");

        String s;
        ArrayList<Integer> a1=new ArrayList<>();

        while (stk.hasMoreElements()){
            s=stk.nextToken();
            a1.add(Integer.valueOf(s));
//            System.out.println(s);
        }
        System.out.println(a1);

    }
}
