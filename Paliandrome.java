import java.util.Scanner;
public class Paliandrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  no");
        int num=sc.nextInt();
        int t=num;
        int a;
        int b=0;
        while(num>0)
        {
            a = num % 10;
            b = b * 10 + a;
            num = num / 10;

        }
        if(b==t)
        {
            System.out.println("paliandrome");
        }
        else{
            System.out.println("not paliandrome");
        }
    }}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    