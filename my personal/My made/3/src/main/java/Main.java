import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberOfList = Arrays.asList(1,2,58,2,94,6,86,35);
        numberOfList.stream().map((i)->""+i)
                .collect(Collectors.joining("-"));
        System.out.println(numberOfList.stream().map((i)->""+i)
                .collect(Collectors.joining("-")));

        //Convert Stream to IntStream
        Stream.of("100","20","30","1")
                .mapToInt(Integer::parseInt);

    }
}
