import java.util.*;
class sort
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of strings in the array");
  int n=sc.nextInt();
  sc.nextLine();
  String arr[]=new String[n];
  System.out.println("Enter" + n +"Strings");
  for(int i=0;i<n;i++)
  {
   arr[i]=sc.nextLine();
  }
  while(true)
  {
   int choice;
   System.out.println("Menu\n 1.search\n 2.sort\n 3.Display\n 4.Exit");
   choice=sc.nextInt();
   sc.nextLine();
   switch(choice)
   {
    case 1:
    System.out.println("Enter the string to search");
    String target=sc.nextLine();
    boolean found=false;
    for(int i=0;i<arr.length;i++)
    {
     if(arr[i].equalsIgnoreCase(target))
     {
      System.out.println("string found at index" + (i+1));
      found=true;
      break;
     }
    }
    if(!found)
    {
     System.out.println("String not found");
    }
    break;
    case 2:
    Arrays.sort(arr);
    System.out.println("Sorted array is" + Arrays.toString(arr));
    break;
    
    case 3:
    System.out.println("the array elements are:");
    for(int i=0;i<arr.length;i++)
    {
     System.out.println(arr[i]);
    }
    break;
    case 4:
    System.out.println("exiting...");
    break;
    
    default:
    System.out.println("invalid");
   }  
  }
 }
}

