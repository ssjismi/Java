import java.util.*;
class Matrix
{
  public static void main(String args[])
   {
     int i,j,k,c1,r1,c2,r2;
     int a[][]=new  int [3][3];
     int b[][]=new int [3][3];
     int res[][]=new  int [3][3];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of  row1:");
     r1=sc.nextInt();
     System.out.println("Enter the size of  column1:");
     c1=sc.nextInt();
     System.out.println("Enter the size of row2:");
     r2=sc.nextInt();
     System.out.println("Enter the size of column2:");
     c2=sc.nextInt();
     
     System.out.println("Enter the matrix1:");
     for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
         {
           a[i][j]=sc.nextInt();
         }
      }
     System.out.println("Enter the matrix2:");
     for(i=0;i<r2;i++)
      {
        for(j=0;j<c2;j++)
         {
           b[i][j]=sc.nextInt();
         }
      }
     if(r1!=r2 && c1!=c2)
      {
        System.out.println("Matrix addition not possible");
      }
      else
       {
         for(i=0;i<r1;i++)
          {
            for(j=0;j<c1;j++)
             { 
               res[i][j]=a[i][j]+b[i][j];
             }
          }
          System.out.println("Sum of matrix:");
          for(i=0;i<r1;i++)
           {
             for(j=0;j<c1;j++)
              {
                System.out.print(res[i][j]+" ");
              }
                System.out.println("\n");
           } 
       }       
         if(c1!=r2)
          {
            System.out.println("Matrix multiplication not possible");
          }
         else
          {
            for(i=0;i<r1;i++)
             {
               for(j=0;j<c2;j++)
                {
                  res[i][j]=0; 
                  for(k=0;k<c1;k++)
                    {
                       res[i][j]=res[i][j]+a[i][k]*b[k][j];
             
                    }
                }
             } 
               System.out.println("Product of matrix:");
                for(i=0;i<r2;i++)
                 {
                   for(j=0;j<c2;j++)
                    {
                       System.out.print(res[i][j]+" ");
                    }
                      System.out.println("\n");
           }      }    
    }
  }                
     
