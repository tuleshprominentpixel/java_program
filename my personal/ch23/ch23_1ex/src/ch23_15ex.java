import java.io.*;

class students{
    int rollno;
    String name;
    float avg;
    String dept;

}

public class ch23_15ex {
    public static void main(String[] s) throws  Exception{
        /*FileOutputStream fos=new FileOutputStream("/home/pp-2/Desktop/java/student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        students s1=new students();
        s1.rollno=1;
        s1.name="Tulesh patel";
        s1.avg=80.55f;
        s1.dept="BCA sem-1";

        dos.writeInt(s1.rollno);
        dos.writeUTF(s1.name);
        dos.writeFloat(s1.avg);
        dos.writeUTF(s1.dept);

        dos.close();
        fos.close();*/
        FileInputStream fis=new FileInputStream("/home/pp-2/Desktop/java/student2.txt");
        DataInputStream dis=new DataInputStream(fis);

        students s1=new students();
        s1.rollno=dis.readInt();
        s1.name=dis.readUTF();
        s1.avg=dis.readFloat();
        s1.dept= dis.readUTF();

        System.out.println("Roll No "+s1.rollno);
        System.out.println("name "+s1.name);
        System.out.println("avg "+s1.avg);
        System.out.println("dept "+s1.dept);

        dis.close();
        fis.close();
    }
}
