import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //"Create a  list insert 5 element Create a  list insert 5 element count and and also
    // convert all name to uppercase print name whose name start with T "
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Tulesh","Rohit","Jenish","Dhruvil","Abc");
        List<String> name = Arrays.asList("Tulesh","Rohit","Jenish","Dhruvil","Abc");

        List<String> nameStartT = name.stream().map((s -> s.toUpperCase())).filter(n->n.startsWith("T")).collect(Collectors.toList());

        Stream<String> nameStartJ = nameStream.map(String::toUpperCase)
                .filter(s -> s.startsWith("J")).peek( e -> System.out.println("peek: "+e));

        System.out.println("Calling terminal operation:");
        System.out.println("Count: "+ nameStartJ.count());

        System.out.println("List of name count whose name start with 'T' : "+ nameStartT.stream().count());
        System.out.println("List of name's  whose name start with 'T' : "+ nameStartT);
    }
}
