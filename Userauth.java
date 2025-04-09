import java.util.*;
class AuthenticationException extends Exception
{
 public AuthenticationException(String message)
 {
 super(message);
 }
}
public class Userauth
{
 public static void authenticateuser(String username,String password)throws AuthenticationException
 {
  String correctUsername="admin";
  String correctPassword="password123";
  if(username.isEmpty()||password.isEmpty())
  {
   throw new AuthenticationException("username or password cannot be empty");
  }
  if(username.length()<5||password.length()<8)
  {
   throw new AuthenticationException("username must be at least 5 characters and password must be atleast 8 characters");
  }
  if(!username.equals(correctUsername))
  {
   throw new AuthenticationException("invalid Username");
  }
  if(!password.equals(correctPassword))
  {
   throw new AuthenticationException("invalid password");
  }
  System.out.println("Authentication successful");
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Username:");
  String username=sc.nextLine();
  System.out.println("Enter Password:");
  String password=sc.nextLine();
  try
  {
   authenticateuser(username,password);
  }
  catch(AuthenticationException e)
  {
   System.out.println("Authentication Failed:" +e.getMessage());
  }
 }
}
   
   
