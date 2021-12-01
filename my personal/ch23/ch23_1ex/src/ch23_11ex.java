import java.io.*;
import java.nio.channels.FileChannel;

public class ch23_11ex {
    public static void main(String[] args) throws Exception
    {
        File f=new File("/home/pp-2/Desktop/java");
        System.out.println(f.isDirectory());
        File list[]=f.listFiles();

        for(File x:list){
            System.out.println(x.getName()+" ");
            System.out.println(x.getPath());
        }
    }
}
