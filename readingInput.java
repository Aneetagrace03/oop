package module;
import java.util.Scanner;
public class readingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter mobile number:");
        long mobileNo = sc.nextLong();
        System.out.println("Enter CGPA:");
        double cgpa = sc.nextDouble();

    }
}

