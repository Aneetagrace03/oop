import java.util.*;
class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int a=0;
        int b=1;
   
        while(a<=n)
        {
            System.out.println(a+"");
            System.out.println("\n");
            int c=a+b;
            a=b;
            b=c;
        }
    
    
    
    
    
    }}