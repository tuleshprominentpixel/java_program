import java.util.Arrays;

public class Ch28_6 {
    //create one array of one element and make one function to change value of that element without using array[index] feature
    public static void main(String[] args) {
        int[] number = new int[1];//create array of 1 length

        number[0] = 10;
        number = Arrays.stream(number).map((number1) -> number1 * 100).toArray();//map function use for any type of operation

        System.out.printf("array : " + number[0]);//print element of 0 index


    }
}
