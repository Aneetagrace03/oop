import java.util.*;
class Fibbnocci{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the limit");
        int limit= sc.nextInt();
        int a=0;
        int b=1;
        int i;
        for(i=0;i<=limit;i++)
    {
        System.out.println(a);
    
        int c=a+b;
        a=b;
        b=c;
    }
 
    
    
    }}