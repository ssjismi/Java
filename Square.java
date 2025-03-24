package graphics;
import java.util.*;
interface Shape1
{
  double display();
}
public class Square implements Shape1
{
 int side;
 public Square()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the side:");
 this.side=sc.nextInt();
 sc.nextLine();
 }
 
 public double display()
 {
 int area=side*side;
  return area;
 }
}
 
 
