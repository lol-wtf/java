
import java.io.*;
import java.net.*;

class setb1clin
{
 public static void main(String arg[])
 {
  try
  {
   Socket s=new Socket("localhost",4200);
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   InputStream in=s.getInputStream();
   DataInputStream din=new DataInputStream(in);
   OutputStream out=s.getOutputStream();
   DataOutputStream dout=new DataOutputStream(out);
   System.out.println("enter no files to check");
   int n=Integer.parseInt(br.readLine());
   int cnt=0,i;
   for(i=0;i<n;i++)
   {
    System.out.println("enter the file name");
    String name=br.readLine();
    dout.writeUTF(name);
    String msg=din.readUTF();
    if(msg.equals("0"))
   System.out.println("file not exists");
    else
   {
    cnt=cnt+1;
    System.out.println("file exists");
   } 
   }
    System.out.println("Total no files:"+cnt);
  }catch(Exception e)
   {
    System.out.println("error="+e);
   }
 }
}

