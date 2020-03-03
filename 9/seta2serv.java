import java.io.*;
import java.net.*;


class seta2serv
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
   String name=din.readUTF();
   System.out.println("name of file "+name);
   OutputStream out=s.getOutputStream();
   DataOutputStream dout=new DataOutputStream(out);
    File f1=new File(name);
    if(f1.exists())
   {
    String msg="",str="";
    FileReader fr=new FileReader(name);
    BufferedReader br=new BufferedReader(fr);
    while((str=br.readLine())!=null)
     msg=msg+str+"\n";
    dout.writeUTF("CONTENTS OF FIE ARE :-\n"+msg);
  
   }
    else
   dout.writeUTF("0");
  }catch(Exception e)
   {
    System.out.println("error="+e);
   }
 }
}

 