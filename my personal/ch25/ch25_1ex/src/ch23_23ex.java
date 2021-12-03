import java.util.Arrays;

public class ch23_23ex {
    public static void main(String[] args) {
        int a[]={2,4,6,1,8,1,3,5,7};
        int b[]={2,4,6,1,8,1,3,5,7};

        int c[]=Arrays.copyOf(a,a.length);

//        Arrays.fill(c,10);
//        for (int x:c){
//            System.out.println(x);
//        }
        Arrays.sort(c);
        for (int x:c){
            System.out.println(x);
        }
        System.out.println("Binary serach :"+Arrays.binarySearch(c,2));
//        System.out.println(Arrays.compare(a,b));
    }
}
