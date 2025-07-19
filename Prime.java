import java.util.Scanner;

class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        boolean isPrime=true;
        if(num<=1)
        { isPrime = false;
        }
        else{
            for(int i=2;i<num;i++)
            {
                if(num%i==0){
                 isPrime = false;
                break;

            }}
        }
        if(isPrime == true)
        { System.out.println(num+ "is a Prime no");}
        else{
            System.out.println(num+"is not  a prime no");
        }
    }
}