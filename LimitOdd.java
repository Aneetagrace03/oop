import java.util.Scanner;
public class LimitOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=sc.nextInt();
        int i;
        for(i = 1;i <= limit;i += 2)
        {
            System.out.println(i);
        }
    }

}