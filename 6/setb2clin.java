
import java.io.*;
import java.net.*;

class setb2clin
{
 public static void main(String arg[])
 {
  try
  {
   Socket s=new Socket("localhost",4200);
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   OutputStream out=s.getOutputStream();
   DataOutputStream dout=new DataOutputStream(out);
   InputStream in=s.getInputStream();
   DataInputStream din=new DataInputStream(in);
    while(true)
   {
     System.out.println("enter the string");
     String s1=br.readLine();
     if(s1.equals("BYE"))
     {
      dout.writeUTF(s1);
       break;
     }
      dout.writeUTF(s1);
     String msg=din.readUTF();
    System.out.println("message from server"+msg);
   }
  }catch(Exception e)
   {
    System.out.println("error="+e);
   }
 }
}
