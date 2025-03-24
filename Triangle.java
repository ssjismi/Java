package graphics;
import java.util.*;
interface Shape1
{
  double display();
}
public class Triangle implements Shape1
{
 int height,breadth;
 public Triangle()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the breadth and height:");
 this.breadth=sc.nextInt();
 sc.nextLine();
 this.height=sc.nextInt();
 sc.nextLine();
 }
 
 public double display()
 {
  double area=0.5*breadth*height;
  return area;
 }
}
 
 
