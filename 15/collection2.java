/*
3. Create a Hash table containing student name and percentage. Display the details of
the hash table. Also search for a specific student and display percentage of that student.
 */
import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class collection2
{
    public static void main(String[] args) throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Hashtable hm=new Hashtable();
    hm.put("Ganesh",new Double(74.89));
    hm.put("Ramesh",new Double(64.89));
    hm.put("Ram",new Double(55.89));
    hm.put("Mahesh",new Double(84.89));
    Set s=hm.entrySet();
    Iterator i=s.iterator();
    System.out.println("Name     Percentage");
    while(i.hasNext())
    {
        Map.Entry me=(Entry) i.next();
        System.out.println(""+me.getKey()+"     "+me.getValue());    
    }
    System.out.println("Enter the student name for search");
    String nm=br.readLine();
    Iterator i1=s.iterator();
    while(i1.hasNext())
    {
        Map.Entry me=(Entry) i1.next();
        if(nm.equalsIgnoreCase((String) me.getKey()))
        System.out.println("The percentage are:"+me.getValue());
    }
   }
}
