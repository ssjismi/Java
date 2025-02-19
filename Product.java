import java.util.*;
class product
{
 int pcode;
 String pname;
 float price;
 void getdata()
 {
  System.out.println("enter the pcode,pname,price");
  Scanner sc=new Scanner(System.in);
  this.pcode=sc.nextInt();
  sc.nextLine();
  this.pname=sc.nextLine();
  this.price=sc.nextFloat();
  }
  void display()
  {
   System.out.println("Product code is"+pcode);
   System.out.println("Product name is"+pname);
   System.out.println("product price is"+price);
  }
 }
 class Product
 {
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   product p1=new product();
   p1.getdata();
   p1.display();
   product p2=new product();
   p2.getdata();
   p2.display();
   product p3=new product();
   p3.getdata();
   p3.display();
   if(p1.price<p2.price && p1.price<p3.price)
   {
    System.out.println("product1 is the lowest");
   }
   else if(p2.price<p3.price)
   {
    System.out.println("product2 is the lowest");
   }
   else
   {
    System.out.println("product3 is the lowest");
   }
  }
 }
  
