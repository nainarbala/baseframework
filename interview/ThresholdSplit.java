import java.util.*;

public class ThresholdSplit {
    public static void main(String[] args) {

        int[] numbers = { 2, 5, 8, 12, 15, 20 };
        int threshold = 10;

        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : numbers) {
            if (num < threshold) {
                smaller.add(num);
            } else {
                greater.add(num);
            }
        }

        System.out.println(smaller);
        System.out.println(greater);
    }
}