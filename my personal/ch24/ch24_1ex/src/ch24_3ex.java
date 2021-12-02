class MyArray<T>{
    T A[]=(T[]) new Object[10];
    int length=0;

    public void append(T v){
        A[length++]=v;
    }
    public void display(){
        for (int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
class MyArray2<T> extends MyArray<T>
{

}
public class ch24_3ex {
    public static void main(String[] args) {
        MyArray2<String> ma=new MyArray2<>();
        ma.append("wow");
//        ma.append(20);
//        ma.append(30);

        ma.display();
    }
}
