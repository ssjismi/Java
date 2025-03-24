import java.util.*;
class Employee
{
 int eno;
 String ename;
 int esalary;
 Employee(int eno,String ename,int esalary)
 {
  this.eno=eno;
  this.ename=ename;
  this.esalary=esalary;
 }
 void display()
 {
  System.out.println("Employee id is:" + eno);
  System.out.println("Employee name is:" + ename);
  System.out.println("Employee salary is:" + esalary);
 }
}
public class employee
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no of employee:");
  int n=sc.nextInt();
  sc.nextLine();
  Employee emp[]=new Employee[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter the " + (i+1) + "employee detail");
   System.out.println("Enter the employeeid: ");
   int eno=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the employee name: ");
   String ename=sc.nextLine();
   System.out.println("Enter the emploee salary: ");
   int esalary=sc.nextInt();
   sc.nextLine();
   emp[i]=new Employee(eno,ename,esalary);
  }
  System.out.println("Enter the employee id to search: ");
  int search=sc.nextInt();
  boolean found=false;
  for(int i=0;i<n;i++)
  {
   if(emp[i].eno==search)
   {
    System.out.println("employee found!!");
    emp[i].display();
    found=true;
    break;
   }
  }
  if(!found)
  {
   System.out.println("Employee not found");
  }
 }
}
 
       
   
