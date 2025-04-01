import java.util.*;
class AuthenticationException extends Exception
{
 public AuthenticationException(String message)
 {
  super(message);
 }
}
public class Userauthentication
{
 public static void authenticate(String username,String password)throws AuthenticationException
 {
  String correctUsername="admin";
  String correctPassword="password123";
  if(!username.equals(correctUsername)||!password.equals(correctPassword))
  {
   throw new AuthenticationException("invalid username and password");
  }
  else
  {
   System.out.println("Auuthentication successfull");
  }
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter username:");
  String username=sc.nextLine();
  System.out.println("Enter password:");
  String password=sc.nextLine();
  try
  {
   authenticate(username,password);
  }
  catch(AuthenticationException e)
  {
   System.out.println(e.getMessage());
  }
 }
}
