
                                  DISPLAY DETAILS INTERMEDIATE
import java.util.*;
class Product
{
     int pcode;
     String pname;
     int price;
     public Product(int pcode,String pname,int price)
     {
       this.pcode=pcode;
       this.pname=pname;
       this.price=price;
     }
     void display()
     {
         System.out.println("Product code is "+pcode);
         System.out.println("Product name is "+pname);
         System.out.println("Product price is "+price);
     }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=limit;i++)
        {
        System.out.println("enter details of product"+i);
        System.out.println("Enter product code: ");
        int pcode=sc.nextInt();
        System.out.print("Enter product price: ");
        int price=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name: ");
        String pname=sc.nextLine();
        Product s=new Product(pcode,pname,price);
        s.display();
        }
    }
}
