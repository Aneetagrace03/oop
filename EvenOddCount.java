import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();

        int[] a = new int[n];  
        int odd=0,even=0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element  ");
            a[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
             if(a[i]%2==0)
             {
                even++;
             }
             else{
                odd++;
             }}
        System.out.println("no of odd numbers is"+odd);
        System.out.println("no of even numbers is"+even);
        }}