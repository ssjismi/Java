import java.util.*;
class Stman
{
 public static void main(String args[])
 {
  String s1,s2;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter two strings");
  s1=sc.nextLine();
  s2=sc.nextLine();
  int len1=s1.length();
  int len2=s2.length();
  System.out.println("The length of first string is"+len1);
  System.out.println("The length of second string is"+len2);
  String so=s1+s2;
  System.out.println("concatenated string is"+ so);
  boolean isequal = s1.equals(s2);
  System.out.println("string1 and string2 are:"+ isequal);
  s1=s2;
  System.out.println("copied value is:" + s1);
 }
}
  
  
