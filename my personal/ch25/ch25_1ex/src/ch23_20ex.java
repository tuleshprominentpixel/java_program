import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ch23_20ex {
    public static void main(String[] args) throws Exception{
        Properties p=new Properties();

        p.setProperty("Brand","Dell");
        p.setProperty("Processor","i7");
        p.setProperty("Os","Windows7");
        p.setProperty("Model","latitute");

//        p.storeToXML(new FileOutputStream("/home/pp-2/Desktop/java/mydata.xml"),"Laptop");
//        p.store(new FileOutputStream("/home/pp-2/Desktop/java/mydata.txt"),"Laptop");
//        System.out.println(p);
        p.loadFromXML(new FileInputStream("/home/pp-2/Desktop/java/mydata.xml"));
//        System.out.println(p);
//        System.out.println(p.getProperty("Os"));
        p.load(new FileInputStream("/home/pp-2/Desktop/java/mydata.txt"));
        System.out.println(p.getProperty("Os"));
//        System.out.println(p);
    }
}
