public class ch24_ex4 {
    /*static <E extends Number> void show(E...  list){
//    static <E> void show(E[] list){
        for (E x:list){
            System.out.println(x);
        }

    }*///generic method simple
    static  void fun(MyArray<? extends A> obj){
        obj.display();
    }

    public static void main(String[] args) {
        /*show(new String[]{"Hii","Go","Bye"});
        show(new Integer[]{1,2,55});*/
//        show("Hii","Go","Bye");
//        show(1,2,55);

        MyArray<B> ma1=new MyArray<>();
//        MyArray<String> ma1=new MyArray<>();
//        ma1.append("hi");
//        ma1.append("bye");

        MyArray<C> ma2=new MyArray<>();
//        MyArray<Integer> ma2=new MyArray<>();
//        ma2.append(10);
//        ma2.append(20);

//        fun(ma1);
//        fun(ma2);

        fun(ma1);
        fun(ma2);
    }
}
