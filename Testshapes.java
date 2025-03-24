import graphics.*;
import java.util.*;
public class Testshapes
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Choose a shape" + "\n" + "1.Rectangle" + "\n" + "2.Triangle" + "\n" + "3.Circle"+"\n"+"4.Square");
  int choice=sc.nextInt();

  switch(choice)
  {
   case 1:
    Rectangle1 shape=new Rectangle1();
    System.out.println("The area of chosen shape is:"+shape.display());
    break;
   case 2:
    Triangle shape1=new Triangle();
    System.out.println("The area of chosen shape is:"+shape1.display());
    break;
   case 3:
    Circle shape2=new Circle();
    System.out.println("The area of chosen shape is:"+shape2.display());
    break;
   case 4:
    Square shape3=new Square();
    System.out.println("The area of chosen shape is:"+shape3.display());
    break;
   default:
    System.out.println("invalid");
    return;
  }
 }
}
 
