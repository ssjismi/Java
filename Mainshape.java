import java.util.*;
interface Shape
{
 double area();
 double perimeter();
}
class Rectangle implements Shape
{
 int length;
 int width;
 public Rectangle()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the length and breadth:");
  this.length=sc.nextInt();
  this.width=sc.nextInt();
 }
 public double area()
 {
  return length*width;
 }
 public double perimeter()
 {
  return 2*(length+width);
 }
}
class Circle implements Shape
{
 private double radius;
 public Circle()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the radius:");
  this.radius=sc.nextDouble();
 }
 public double area()
 {
  return 3.14*radius*radius;
 }
 public double perimeter()
 {
  return 2*3.14*radius;
 }
}
public class Mainshape
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int choice;
  do
  {
  System.out.println("Menu \n"+"1.Rectangle"+"\n"+"2.Circle"+"\n"+"3.exit");
  System.out.println("enter your choice:");
  choice=sc.nextInt();
  Shape shape=null;
  if(choice==1)
  {
   shape=new Rectangle();
  }
  else if(choice==2)
  {
   shape=new Circle();
  }
  else if(choice==3)
  {
   System.out.println("Exiting");
   break;
  }
  System.out.println("Area:" + shape.area());
  System.out.println("Perimeter:" + shape.perimeter());
  }
  while(choice!=3); 
 }
}

