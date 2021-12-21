public class Ch28_5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = increment(num1);
        System.out.println("The after method call " + num1 + " is " + num2);
        num1++;//out side method ++ operator
        System.out.printf("in main method num1 increment : " + num1);
    }

    public static int increment(int num1) {
        System.out.println("enter in method : " + num1);
        num1++;//in method ++ operator
        System.out.println("increment in method : " + num1);
        return num1;
    }
}
