import java.util.*;
class Matrix
{
 int row,col;
 int[][] arr=new int[10][10];
 void getdata()
 {
  
  System.out.println("Enter the no of rows and columns");
  Scanner sc=new Scanner(System.in);
  row=sc.nextInt();
  sc.nextLine();
  col=sc.nextInt();
  System.out.println("Enter the matrix elements");
  if(int i=0;i<row;1++)
  {
   if(int j=0;j<col;j++)
   {
    int a[j][j]=sc.nextInt();
   }
  }
  void display()
  {
   System.out.println("The matrix is"+a[row][col]);
  }
 }
}
class matrix
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Matrix m1=new Matrix();
  m1.getdata();
  m1.display();
  Marix m2=new Matrix();
  
  
  
