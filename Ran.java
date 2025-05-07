import java.io.*;
import java.util.*;
public class Ran
{
 public static void main(String args[])throws IOException
 {
  String sourceFile="number.txt";
  String evenFile="even.txt";
  String oddFile="odd.txt";
  RandomAccessFile raf=new RandomAccessFile(sourceFile,"rw");
  for(int i=1;i<=20;i++)
  {
   raf.writeInt(i);
  }
  raf.close();
  RandomAccessFile rafRead=new RandomAccessFile(sourceFile,"r");
  RandomAccessFile rafeven=new RandomAccessFile(evenFile,"rw");
  RandomAccessFile rafodd=new RandomAccessFile(oddFile,"rw");
  while(rafRead.getFilePointer()<rafRead.length())
  {
   int num=rafRead.readInt();
   if(num%2==0)
   {
    rafeven.writeInt(num);
   }
   else
   {
   rafodd.writeInt(num);
   }
  }
  rafRead.close();
  rafeven.close();
  rafodd.close();
  System.out.println("contents of" + sourceFile + ":");
  displayInts(sourceFile);
  System.out.println("contents of" + evenFile + ":");
  displayInts(evenFile);
  System.out.println("contents of" + oddFile + ":");
  displayInts(oddFile);
 }
 public static void displayInts(String filename)throws IOException
 {
  RandomAccessFile raff=new RandomAccessFile(filename,"r");
  while(raff.getFilePointer()<raff.length())
  {
   System.out.println(raff.getFilePointer()<raff.length());
   {
    System.out.println(raff.readInt() + " ");
   }
   raff.close();
  }
 }
}
   
