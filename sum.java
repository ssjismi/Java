import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        sc.nextLine();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("The sum is:"+sum);
    }
}
