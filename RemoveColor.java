import java.util.*;

public class RemoveColor {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
       System.out.println(colors);
        colors.remove("Green");
        System.out.println(colors);
    }
}
