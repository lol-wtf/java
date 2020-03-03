import java.io.*;

class DirDemo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String dirname=args[0],ext;

		int ch,i,cnt=0;
		File f1=new File(dirname);
		ext="txt";
		if(f1.isFile())
		{
		System.out.println(f1+"is a File\n");
		System.out.println("Path  : "+f1.getAbsolutePath());
		System.out.println("File Size  : "+f1.length()+"bytes\n");
		}
		else if(f1.isDirectory())
		{
		System.out.println(args[0]+"Is a Directory\n");
		System.out.println("Contents of  : "+dirname);
		String s[]=f1.list();
		
		for(i=0;i<s.length;i++)
		{
		File f=new File(dirname,s[i]);
		if(f.isFile())
		{
		cnt++;
		System.out.println(s[i]+"is a File\n");
		}
		else
		System.out.println(s[i]+"is a Directory\n");
		}
		System.out.println("Total Number Of Files :"+cnt);
		System.out.println("Do you want to delete files with extension 'txt'(1/0):?");
		ch=Integer.parseInt(br.readLine());
		if(ch==1)
		{
		for(i=0;i<s.length;i++)
		{
			File f=new File(dirname,s[i]);
			if(f.isFile() && s[i].endsWith(ext))
			{
				System.out.println(s[i]+"->deleted");
				f.delete();
			}
		}
		}
		}
	}
}


/*Output :-
t1.txt is a File

Path   :t1.txt
File Size : 36 bytes */
