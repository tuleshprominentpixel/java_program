import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    //"create a list and insert 15 number in it (enter some repeated value also),
    //--list make sort and distinct and print it also.
    //--after above task show only first 5 element of that.
    //--display the list element after third.

    public static void main(String[] args) {
        //Convert IntStream to Stream
        String number = IntStream.of(100, 50, 1, 20, 30)
                .mapToObj((i) -> "" + i)
                .collect(Collectors.joining("-"));
        System.out.println(number);

        List<Integer> numberOfList = Arrays.asList(10, 10, 2, 30, 30, 4, 5, 5, 15, 2, 500, 10, 20, 7,80);
        System.out.println("The  sorted and distinct elements are :");

        String s1 = numberOfList.stream().sorted().distinct().map((n) -> "" + n).collect(Collectors.joining("-"));
        System.out.println("sorted and distinct : " + s1);

        numberOfList.stream().limit(5).forEach(num-> System.out.println(num));

        List<Integer> number1 = numberOfList.stream().skip(3).collect(Collectors.toList());
        System.out.println(number1);
    }
}
