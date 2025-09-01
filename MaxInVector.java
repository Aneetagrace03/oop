import java.util.*;

public class MaxInVector {
    public static void main(String[] args) {
        Vector<Integer> values = new Vector<>();
        values.add(25);
        values.add(60);
        values.add(15);
        values.add(80);
        values.add(45);

        int max = 0;
        for (int val : values) {
            if (val > max) {
                max = val;
            }
        }

        System.out.println("Max: " + max);
    }
}
