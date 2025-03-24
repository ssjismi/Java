import java.util.*;
class arithmatic
{
public static void main(String args[])
{
int n1,n2,sum=0,pro=0,quo=0,diff=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter two numbers");
n1=sc.nextInt();
sc.nextLine();
n2=sc.nextInt();
sum=n1+n2;
pro=n1*n2;
quo=n1/n2;
diff=n1-n2;
System.out.println("Sum="+sum);
System.out.println("difference="+diff);
System.out.println("Product="+pro);
System.out.println("Division="+quo);
}
}
