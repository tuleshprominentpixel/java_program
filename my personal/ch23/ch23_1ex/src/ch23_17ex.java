import java.io.Serializable;
import java.io.*;

class student3 implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static  int Data=10;
    public transient int t;
    public student3(){

    }

    public student3(int r,String n,Float a,String d){
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=55;

    }
    public  String toString(){
        return "\nStudent Detail\n"+
                "\nRoll "+rollno+
                        "\nName "+name+
                        "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient  "+t+"\n";

    }
}
public class ch23_17ex {
    public static void main(String[] s) throws  Exception{
        /*FileOutputStream fos=new FileOutputStream("/home/pp-2/Desktop/java/student3.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        student3 s3=new student3(1,"GTR",95.0f,"MCA");
        oos.writeObject(s3);

        oos.close();
        fos.close();*/

        FileInputStream fis=new FileInputStream("/home/pp-2/Desktop/java/student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

//        student3 s3=new student3(1,"GTR",95.0f,"MCA");
        student3 s4=(student3) ois.readObject();

        System.out.println(s4);
        ois.close();
        fis.close();
    }
}
