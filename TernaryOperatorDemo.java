package module1;
import java.util.Scanner;
public class TernaryOperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNo, secondNo;
        System.out.println("Enter the first number:");
        firstNo = sc.nextInt();
        System.out.println("Enter the second number:");
        secondNo = sc.nextInt();
        int bigNo = firstNo > secondNo ? firstNo : secondNo;
        System.out.println("I'm " + bigNo + ", the big number.");
        sc.close(); // good practice to close the scanner
    }
}
