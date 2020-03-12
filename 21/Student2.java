import java.io.*;

class Student2
{
        private int rollno;
        private String sname;
        private float per;
        private static int cnt=0;
        public Student2(int r,String n,float p)
        {
                rollno=r;
                sname=n;
                per=p;
                cnt++;
        }

	  

        public String toString()
        {
                return "Roll No. : "+rollno+" Name : "+sname+" Percentage : "+per;
        }

	 public static void sort(Student2 s[])

        {
                int i,j;
                String temp;
                int t1;
                float t2;
                for(i=0;i<s.length;i++)
                {
                        for(j=i+1;j<s.length;j++)
                        {
                                if(s[i].per>s[j].per)
                                {
                                        temp=s[i].sname;
                                        s[i].sname=s[j].sname;
                                        s[j].sname=temp;

                                        t1=s[i].rollno;
                                        s[i].rollno=s[j].rollno;
                                        s[j].rollno=t1;

                                        t2=s[i].per;
                                        s[i].per=s[j].per;
                                        s[j].per=t2;

                                }
                        }
                }

	}	
       
	 public static void main(String args[])throws IOException
        {
		int rno=1;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter How many Students"); 
		int n=Integer.parseInt(br.readLine());
                Student2[] s=new Student2[n];
                System.out.println("NO. of objects = "+Student2.cnt);
                for(int i=0;i<n;i++)
                {
                      
		System.out.println("\n\t\tENTER THE NAME :");
		String sname=br.readLine();
		System.out.println("\n\t\tENTER THE PERCENTAGE:");
		float per=Float.parseFloat(br.readLine());
		s[i]=new Student2(rno,sname,per);rno++;
                }
               System.out.println("NO. of objects = "+Student2.cnt);
                for(int i=0;i<n;i++)
                
                System.out.println(s[i]);
	      sort(s);
	      System.out.println("\n\t\t*****SORTED DETAILS ARE:*******");
            	for(int i=0;i<n;i++)
                
               System.out.println(s[i]);
                
               
         
        }   
}            

 
