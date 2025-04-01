import java.util.*;
class Fibonacci implements Runnable
{
 public void run()
 {
 int num1=0,num2=1;
 System.out.println("fibonacci series:");
 for(int i=0;i<10;i++)
 {
  System.out.println(num1+" ");
  int nextnum=num1+num2;
  num1=num2;
  num2=nextnum;
 }
 System.out.println();
 }
}
class Evennumber implements Runnable
{
 public void run()
 {
  System.out.println("the even numbers betweeen 1 and 20 are:");
  for(int i=1;i<20;i++)
  {
   if(i%2==0)
   {
    System.out.println(i+" ");
   }
  }
  System.out.println();
 }
}
public class Run
{
 public static void main(String args[])
 {
  Thread fibonaccithread=new Thread(new Fibonacci());
  Thread evennumberthread=new Thread(new Evennumber());
  fibonaccithread.start();
  evennumberthread.start();
  while(fibonaccithread.isAlive() || evennumberthread.isAlive())
  {
  }
  System.out.println("both tasks completed");
 }
}
   
    
