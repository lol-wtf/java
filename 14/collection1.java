/*
 2. Construct a linked List containing names of colors: red, blue, yellow and orange.
      Then extend your program to do the following:
      i.     Display the contents of the List using an Iterator;
      ii.    Display the contents of the List in reverse order using a ListIterator;
      iii. Create another list containing pink and green. Insert the elements of this list
             between blue and yellow.
 */
import java.util.*;
public class collection1
{

    public static void main(String[] args) 
    {
    LinkedList t=new LinkedList();
    t.add("red");
    t.add("blue");
    t.add("yellow");
    t.add("orange");
    Iterator i=t.iterator();
    System.out.println("The Elements Are");
    while(i.hasNext())
    System.out.println(i.next());
    ListIterator i1=t.listIterator();
    while(i1.hasNext())
    i1.next();
    System.out.println("The Elements In Reverse Order");
    while(i1.hasPrevious())
    System.out.println(i1.previous());
    LinkedList t2=new LinkedList();
    t2.add("pink");
    t2.add("green");
   
    t.addAll(2, t2);
  
    Iterator i2=t.iterator();
    System.out.println("The Total Elements Are");
    while(i2.hasNext())
    System.out.println(i2.next());
  }
}
