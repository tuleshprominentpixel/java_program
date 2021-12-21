import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch8_2 {
//    private static final String REGEX = "\\b[a-zA-z1-9]*gmail.com\\b";
//    private static final String INPUT = "abcd123df@gmail.com";

    public static void main(String[] args) {
        final String REGEX = "\\b[a-zA-z1-9]*gmail.com\\b";
        final String INPUT = "abcd123df@gmail.com";
        Pattern patternForRegex = Pattern.compile(REGEX);
        Matcher m = patternForRegex.matcher(INPUT);   // get a matcher object
        int count = 0;
        while (m.find()) {
            System.out.printf("pattern found");
            count++;
        }
        if(count==0){
            System.out.printf("pattern not match");
        }
    }
}
