import java.util.Arrays;
import java.util.Comparator;

public class SecondLongestWordLength {

    public static void main(String[] args) {
        String input = "Java SpringBoot React Microservices";

        String result = Arrays.stream(input.split("\\s+"))
                .map(x -> x.length())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .map(x1 -> x1.toString())
                .orElse("Not found");

        System.out.println(result);
    }

}
