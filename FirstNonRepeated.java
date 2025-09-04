
import java.util.Scanner;

public class FirstNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}