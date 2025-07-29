import java.util.Scanner;

public class Arraydisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();

        int[] a = new int[n];  

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element  ");
            a[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    System.out.println("reverse");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);

       
        }

        sc.close();
    }
}
