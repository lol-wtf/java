
import java.io.*;
import java.net.*;


class setb2serv
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
    while(true)
   {
    String msg=din.readUTF();
     if(msg.equals("BYE"))
       break;
     else
    dout.writeUTF("msg="+msg.toUpperCase());
   }
  }catch(Exception e)
   {
    System.out.println("error="+e);
   }
 }
}


