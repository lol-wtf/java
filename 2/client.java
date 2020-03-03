import java.net.*;
import java.io.*;
class client
{
  public static void main(String a[])
  {
    try
     {
      Socket sc=new Socket("localhost",4200);
      InputStream in=sc.getInputStream();
      DataInputStream din=new DataInputStream(in);
      String s=din.readUTF();
      System.out.println("Date of server "+s);
      }catch(Exception e)
       {
        System.out.println("Error "+e);
        }
  }
}