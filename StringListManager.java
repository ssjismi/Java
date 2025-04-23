import java.util.*;
public class StringListManager
{
 public static void main(String args[])
 {
  ArrayList<String> st=new ArrayList<>();
  ArrayList<Integer> su=new ArrayList<>();
  su.add(1);
  su.add(5);
  su.add(3);
  su.add(0);
  System.out.println(su);
  Collections.sort(su);
  System.out.println("integer sorted" + su);
  Scanner sc=new Scanner(System.in);
  st.add("Apple");
  st.add("Orange");
  st.add("banana");
  st.add("Kiwi");
  System.out.println("Initial list:" +st);
  System.out.println("Enter a string to add:");
  String input=sc.nextLine();
  st.add(input);
  System.out.println("List after adding:"+st);
  st.remove("Orange");
  System.out.println("List after removing 'Orange':"+st);
  Collections.sort(st);
  System.out.println("sorted list:" + st);
  System.out.println("Enter a string to search:");
  String search=sc.nextLine();
  if(st.contains(search))
  {
   System.out.println(search + "is in the list");
  }
  else
  {
   System.out.println(search + "is not found");
  }
  System.out.println("Total no of elements:" + st.size());
 }
}
