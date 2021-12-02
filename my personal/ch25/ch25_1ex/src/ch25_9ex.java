import java.util.ArrayDeque;

public class ch25_9ex {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(40);
        dq.offerLast(20);
        dq.offerLast(200);

        dq.pollFirst();

        /*dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);*/

        dq.forEach((x)-> System.out.println(x));
//        System.out.println(dq);

    }

}
