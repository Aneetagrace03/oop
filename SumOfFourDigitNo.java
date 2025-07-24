import java.util.Scanner;
public class SumOfFourDigitNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a four digit no");
        int num=sc.nextInt();
        int sum=0;
        int a;
        int b=num;
        while(num>0)
        {
            a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println("sum of digit of " +b+ "is" +sum);
    }
}