package ch23_7ex;

import java.io.ByteArrayInputStream;

public class ch23_7ex {
    public static void main(String[] args) throws Exception {
        byte c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(c);

//        String str=new String(bis.readAllBytes());
        /*int x;
        while ((x=bis.read())!=-1){
            System.out.print((char) x);
        }
        bis.close();*/
    }
}
