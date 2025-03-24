package graphics;
import java.util.*;
interface Shape1
{
  double display();
}
public class Circle implements Shape1
{
 int radius;
 public Circle()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the radius:");
 this.radius=sc.nextInt();
 sc.nextLine();
 }
 public double display()
 {
  double area=3.14*radius*radius;
  return area;
 }
}
