import java.util.*;
class Person
{
 String Name,Gender,Address;
 int Age;
 Person(String name,String gender,String address,int age)
 {
  this.Name=name;
  this.Gender=gender;
  this.Address=address;
  this.Age=age;
 }
}
class Employee extends Person
{
 int Empid,Salary;
 String Cname,Qualification;
 Employee(String name,String gender,String address,int age,int empid,int salary,String cname,String qualification)
{
 super(name,gender,address,age);
this.Empid=empid;
this.Salary=salary;
this.Cname=cname;
this.Qualification=qualification;
}
}
class Teacher extends Employee
{
 int Teacherid;
 String Subject,Department;
 Teacher(String name,String gender,String address,int age,int empid,int salary,String cname,String qualification,int teacherid,String subject,String department)
{
 super(name,gender,address,age,empid,salary,cname,qualification);
 this.Teacherid=teacherid;
 this.Subject=subject;
 this.Department=department;
}
void display()
{
 System.out.println("Name:"+Name+"\n"+"Gender:"+Gender+"\n"+"Address:"+Address+"\n"+"Age:"+Age+"\n"+"Empid:"+Empid+"\n"+"Companyname:"+Cname+"\n"+"Qualification:"+Qualification+"\n"+"Salary:"+Salary+"\n"+"Teacherid:"+Teacherid+"\n"+"Subject:"+ Subject+"\n"+"Department:"+Department);
}
}
class person
{
 public static void main(String args[])
 {
  int n,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no.of techers:");
  n=sc.nextInt();
  sc.nextLine();
  Teacher[] teachers=new Teacher[4];
for(i=0;i<n;i++)
{
 System.out.println("Enter the name:");
 String name=sc.nextLine();
 System.out.println("Enter the gender:");
 String gender=sc.nextLine();
 System.out.println("Enter the address:");
 String address=sc.nextLine();
 System.out.println("Enter the age:");
 int age=sc.nextInt();
 System.out.println("Enter the Employee id:");
 int empid=sc.nextInt();
 System.out.println("Enter the salary:");
 int salary=sc.nextInt();
 sc.nextLine();
 System.out.println("Enter the company name:");
 String cname=sc.nextLine();
 System.out.println("Enter the qualification:");
 String qualification=sc.nextLine();
 System.out.println("Enter the Teacherid:");
 int teacherid=sc.nextInt();
 sc.nextLine();
 System.out.println("Enter Subject:");
 String subject=sc.nextLine();
System.out.println("Enter the Department:");
 String department=sc.nextLine();
 teachers[i]=new Teacher(name,gender,address,age,empid,salary,cname,qualification,teacherid,subject,department);
}
for(i=0;i<n;i++)
{
 System.out.println("Teacher Details");
 teachers[i].display();
}
}
}

 
 
 

