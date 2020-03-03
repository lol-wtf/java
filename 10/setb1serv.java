import java.io.*;
import java.net.*;


class setb1serv
{
 public static void main(String arg[])
 {
  try
  {
   ServerSocket sc=new ServerSocket(4200);
   System.out.println("waiting for connection");
   Socket s=sc.accept();
   System.out.println("connection is established");
   InputStream in=s.getInputStream();
   DataInputStream din=new DataInputStream(in);
   OutputStream out=s.getOutputStream();
   DataOutputStream dout=new DataOutputStream(out);
    
    for(int i=0;i<3;i++)
   {
     String name=din.readUTF();
     System.out.println("name of file "+name);
     File f1=new File(name);
     if(f1.exists())
    {
     dout.writeUTF("1");
    }
     else
     dout.writeUTF("0");
   }
  }catch(Exception e)
   {
    System.out.println("error="+e);
   }
 }
}


