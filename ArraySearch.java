import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();

        int[] a = new int[n];  

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.println("Found " + key + " at index " + i);
                
            }
            else {
            System.out.println("Not found");
        }


        }

        if (!found) {
            System.out.println("Not found");
        }

        
    }
}
