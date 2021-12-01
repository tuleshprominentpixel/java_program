package ch23_9ex;

import java.io.*;

class Producer extends Thread
{
    OutputStream os;

    public Producer(OutputStream o)
    {
        os=o;
    }

    public void run()
    {
        int count=1;

        while(true)
        {
            try{
                os.write(count);
                os.flush();

                System.out.println("Producer "+count);
                System.out.flush();

                Thread.sleep(10);
                count++;
            }catch(Exception e){}
        }
    }

}
class Consumer extends  Thread{
    InputStream is;

    public Consumer(InputStream s)
    {
        is=s;
    }

    public void run()
    {
        int x;

        while(true)
        {
            try{

                x=is.read();

                System.out.println("Consumer "+x);
                System.out.flush();
                Thread.sleep(10);

            }catch(Exception e){}
        }
    }
}
public class ch23_9ex {
    public static void main(String[] args) throws Exception {
        PipedInputStream pi=new PipedInputStream();
        PipedOutputStream po=new PipedOutputStream();

        po.connect(pi);
        Producer p=new Producer(po);
        Consumer c=new Consumer(pi);

        p.start();
        c.start();
    }
}
