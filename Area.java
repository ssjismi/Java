import java.util.*;
class Area
{
 public static void main(String args[])
 {
  int length,breadth,radius;
  Scanner sc=new Scanner(System.in);
  
  void area(int length,int breadth)
  {
   System.out.println("Enter the length:");
   int length=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the breadth:);
   int breadth=sc.nextInt();
   sc.nextLine();
   area=length*breadth;
  }
  
  void area(int length,int breadth,int height)
  {
   System.out.println("Enter the length:");
   int length=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the breadth:");
   int breadth=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the height:");
   int height=sc.nextInt();
   sc.nextLine();

   area=length*breadth*height;
      System.out.println("Area of triangle:" +area);
  }
  area(1,2);
  area(2,3,2);
 }
}
  
 

