import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();

        int[] a = new int[n];  

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element  ");
            a[i] = sc.nextInt();}
            Arrays.sort(a);
            for(int num:a){
                System.out.println(num +"");
            }
        }}