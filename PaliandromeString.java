import java.util.Scanner;
public class PaliandromeString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("reversed string is "+rev);
        if(str.equals(rev)){ 
            System.out.println("paliandrome");

        }
        else
        {
            System.out.println("not pliandrome");
        }
    }
}