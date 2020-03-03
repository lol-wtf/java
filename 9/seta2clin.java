
import java.io.*;
import java.net.*;

class seta2clin
{
 public static void main(String arg[])
 {
  try
  {
   Socket s=new Socket("localhost",4200);
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter the file name");
   String name=br.readLine();
   OutputStream out=s.getOutputStream();
   DataOutputStream dout=new DataOutputStream(out);
    dout.writeUTF(name);
   InputStream in=s.getInputStream();
   DataInputStream din=new DataInputStream(in);
   String msg=din.readUTF();
    if(msg.equals("0"))
   System.out.println("file not found");
    else
   System.out.println(msg);
  }catch(Exception e)
   {
    System.out.println("error="+e);
   }
 }
}

