import java.util.*;
class table extends Thread
{
 public void run()
 {
  Scanner sc=new Scanner(System.in);
  //System.out.println("enter the multiplication table no:");
  //int n=sc.nextInt();
  for(int i=1;i<=10;i++)
  {
   System.out.println("from table"+(i*2));
  }
 System.out.println("exiting from table");
}
}
class Prime extends Thread
{
 public void run()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the limit:");
  int n=sc.nextInt();
  int flag;
  for(int j=2;j<n;j++)
  	{
  	flag=0;
	for(int i=2;i<=j/2;i++)
	  {
	   if(j%i==0)
	   	{
	   	flag=1;
	   	break;
	   	}
  	  }
  	  if( flag==0)
 	  	System.out.println("Prime no:"+j);
	}
	System.out.println("exiting from prime");
	}
}
class pg12
{
 public static void main(String args[])
 {
  table a=new table();
  Prime b=new Prime();
  a.start();
  b.start();
 }
}
 
  
