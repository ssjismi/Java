import java.util.*;
public class overload
{
 public void area(int length,int width)
 {
  int area=length*width;
  System.out.println("Area of rectangle:" + area);
 }
 public void area(int side)
 {
  int area=side*side;
  System.out.println("Area of square:" + area);
 }
 public void area(double base1,double base2,double height)
 {
  double area=0.5*(base1+base2)*height;
  System.out.println("Area of Trapezium:" + area);
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  overload cal=new overload();
  System.out.println("Enter the length and width:");
  int length=sc.nextInt();
  sc.nextLine();
  int width=sc.nextInt();
  sc.nextLine();
  cal.area(length,width);
  System.out.println("Enter the side:");
  int side=sc.nextInt();
  sc.nextLine();
  cal.area(side);
  System.out.println("Enter base1,base2 and height:");
  double base1=sc.nextDouble();
  sc.nextLine();
  double base2=sc.nextDouble();
  sc.nextLine();
  double height=sc.nextDouble();
  sc.nextLine();
  cal.area(base1,base2,height);
 }
} 
 
  
