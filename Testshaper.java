import graphics.*;
public class Testshaper
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Choose a shape to calculate the area:");
  System.out.println("1.Rectangle" + "\n" + "2.Square" + "\n" + "3.Triangle"+"\n"+"4.Circle");
  int choice=sc.nextInt();
  Shape shape=null;
  switch(choice)
  {
   case 1:
    shape=new Rectangle();
    break;
   case 2:
    shape=new Square();
    break;
   case 3:
    shape=new Circle();
    break;
   default:
    System.out.println("invalid");
    return;
  }
  System.out.println("the area of the chosen shape is:" +shape.area());
 }
}
