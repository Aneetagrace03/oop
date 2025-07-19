import java.util.*;

public class Primeuptolimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int limit = sc.nextInt();

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;  
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);  
            }
        }
    }
}

        