/*
  1. Accept n integers from the user and store them in a collection. Display them in the
sorted order. The collection should not accept duplicate elements. (Use a suitable
collection).
 */
import java.util.*;
import java.io.*;
public class collection
{
    public static void main(String[] args) throws IOException
    {
    int n;
   
	HashSet hs=new HashSet();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the no of elements");
    n=Integer.parseInt(br.readLine());
    System.out.println("Enter the nos");
    for(int i=0;i<n;i++)
    {
    int a=Integer.parseInt(br.readLine());
    hs.add(a);
    }
	System.out.println("The elements are"+hs);
	 TreeSet t=new TreeSet(hs);
    Iterator it=t.iterator();
    System.out.println("The Sorted data");
    while(it.hasNext())
    System.out.println(it.next());
	System.out.println("Enter the no to search");
    int no=Integer.parseInt(br.readLine());
	if(hs.contains(no))
	System.out.println("No Found");
	else
	System.out.println("No Not Found");
  }
}
