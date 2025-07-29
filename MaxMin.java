import java.util.Scanner;

public class MaxMin {
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
        int max=a[0
        ];
        int min=a[0];
        for (int i = 0; i < n; i++){
            if(a[i]>max){
                max=a[i];
                i++;

            }
        }
for (int i = 0; i < n; i++){
    if(a[i]<min){
        min=a[i];
        i++;
    }
}
System.out.println("maximum value is "+max);
System.out.println("minimum value is "+min);
    }}