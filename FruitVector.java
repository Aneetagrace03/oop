import java.util.*;

public class FruitVector {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
