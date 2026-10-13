import java.util.Arrays;

public class SecondLargestNumber {

    public static Integer findSecondLargest(int[] numbers) {
        Integer[] distinctNumbers = Arrays.stream(numbers)
                .boxed()
                .distinct()
                .sorted()
                .toArray(Integer[]::new);

        if (distinctNumbers.length < 2) {
            return null;
        }

        return distinctNumbers[distinctNumbers.length - 2];
    }

    public static void main(String[] args) {

        int[] numbers = { 10, 25, 30, 45, 20, 45, 35 };

        System.out.println(findSecondLargest(numbers));
    }
}
