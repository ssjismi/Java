import java.util.*;
class cpu
{
  int price;
  public cpu(int price)
  {
   this.price=price;
  }
  class Processor
  {
   int core;
   String manufacturer;
   Processor(int core,String manufacturer)
   {
    this.core=core;
    this.manufacturer=manufacturer;
   }
   void displayprocess()
   {
    System.out.println("core is:" + core);
    System.out.println("Manufacturer is:" + manufacturer);
   }
  }
  static class Ram
  {
   int mem;
   String manufacturer;
   Ram(int mem,String manufacturer)
   {
    this.mem=mem;
    this.manufacturer=manufacturer;
   } 
   void displayRam()
   {
    System.out.println("Memory is:" + mem + "GB");
    System.out.println("Memory Manufacturer is:" + manufacturer);
   }
}
public static void main(String args[])
{
 cpu c=new cpu(30000);
 cpu.Processor p=c.new Processor(5, "intel");
 cpu.Ram r=new cpu.Ram(4, "IBM");
 System.out.println("cpu price" +c.price);
 p.displayprocess();
 r.displayRam(); 
}
}
  
    
