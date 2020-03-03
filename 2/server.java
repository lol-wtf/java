


import java.net.*;
import java.io.*;
import java.util.*;
class server
{
  public static void main(String a[])
  {
    try
     {
      ServerSocket sc=new ServerSocket(4200);
      System.out.println("Waiting for connection ");
      Socket s=sc.accept();
      OutputStream out=s.getOutputStream();
      DataOutputStream dout=new DataOutputStream(out);
      Date d=new Date();
       
      dout.writeUTF("Date "+d);
     
   
      }catch(Exception e)
       {
        System.out.println("Error "+e);
        }
  }
}

