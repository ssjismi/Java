import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n,fact=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find factorial");
        n=sc.nextInt();
        sc.nextLine();
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("the factorial is:"+fact);
    }
}
