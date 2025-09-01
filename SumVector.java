import java.util.*;

public class SumVector {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        for (int num : numbers) {
            sum =sun+ num;
        }

        System.out.println("Sum: " + sum);
    }
}
