import java.io.*;

class student{
    int rollno;
    String name;
    String dept;
}
public class ch23_13ex {
    public static void main(String[] s) throws  Exception{
        /*FileOutputStream fos=new FileOutputStream("/home/pp-2/Desktop/java/student1.txt");
        PrintStream ps=new PrintStream(fos);

        student s1=new student();
        s1.rollno=10;
        s1.name="Tulesh";
        s1.dept="BCA";

        ps.println(s1.rollno);
        ps.println(s1.name);
        ps.println(s1.dept);

        ps.close();
        fos.close();*/
        FileInputStream fis=new FileInputStream("/home/pp-2/Desktop/java/student1.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));

        student s2=new student();
        s2.rollno=Integer.parseInt(br.readLine());
        s2.name=br.readLine();
        s2.dept=br.readLine();

        System.out.println("Roll No "+s2.rollno);
        System.out.println("name "+s2.name);
        System.out.println("dept "+s2.dept);

    }
}
