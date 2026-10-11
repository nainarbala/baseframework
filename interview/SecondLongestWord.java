import java.util.Arrays;
import java.util.Comparator;

public class SecondLongestWord {
    public static void main(String[] args) {

        String input = "Java SpringBoot React Microservices";

        String result = Arrays.stream(input.split("\\s+"))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse("Not found");

        System.out.println(result);
    }
}