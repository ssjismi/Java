import java.util.*;
class Matrix
{
 public static void main(String args[])
 {
  int r,c,i,j,k;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the row");
  r=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the column");
  c=sc.nextInt();
  int matrix1[][]=new int[r][c];
  int matrix2[][]=new int[r][c];
  int res[][]=new int[r][c];
  
  System.out.println("Enter the first matrix:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    matrix1[i][j]=sc.nextInt();
    System.out.println();
  }
  
  System.out.println("enter the second matrix:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    matrix2[i][j]=sc.nextInt();
    System.out.println();
  }
  
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    res[i][j]=matrix1[i][j]+matrix2[i][j];
  }
  System.out.println("The sum of two matrix is:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    System.out.print(res[i][j]+"\t");
    System.out.println("\n");
  }
  
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    res[i][j]=0;
    for(k=0;k<r;k++)
    {
     res[i][j]+=matrix1[i][k]*matrix2[k][j];
    }
   }
  }
  
  System.out.println("The product of matrix is:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    System.out.print(res[i][j]+"\t");
   }
   System.out.println("\n");
  }
 }
}

  
