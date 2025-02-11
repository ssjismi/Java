import java.util.*;
class Student
{
    int rollno;
    String name;
    public Student(int roll,String name)
    {
        this.rollno=roll;
        this.name=name;
    }
    void display()
    {
       System.out.println("the roll no is"+rollno);
       System.out.println("and name is"+name);  
    }
}
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the roll number: ");
        int roll = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        Student ob=new Student(roll,name);
        ob.display();
    }
}
