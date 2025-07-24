import java .util.Scanner;
public class SimpleCalculator{
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the first number");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    System.out.println("enter the operator");
    char op = sc.next().charAt(0);

    switch (op) {
        case '+':
        System.out.println((a+b));
        break;
        case '-':
        System.out.println((a-b));
        break;
        case '%':
        System.out.println((a%b));
        break;
        case '*':
        System.out.println((a*b));
        break;
        case '/':
                 if(b!=0){
        System.out.println((a/b));}
                else{
                    System.out.println("division is not possible");
                }
        break;
        default:
               System.out.println("invalid");

    }
}
}