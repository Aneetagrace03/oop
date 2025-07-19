import java.util.*;
class Gcd{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int c;
        while(b!=0)
        {
            c=b;
            b=a%b;
            a=c;
        }
        System.out.println("greatest common divisor of the number is" + a);
    }
}