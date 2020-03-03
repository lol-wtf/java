import java.io.*;

abstract class Staff
{
        String name,address;
        
        Staff(String n,String addr)
        {
		
                name=n;
                address=addr;

        }
        
	public void display()
	{
		System.out.print(" Name : "+name+" Address : "+address);
	}
}

class Full_Time_Staff extends Staff
{
        String dept;
	int sal;

        Full_Time_Staff(String n,String addr,String d,int sal)
        {
                super(n,addr);
                this.sal=sal;
                dept=d;;
        }

        public void display()
        {
		super.display();
                		
		  System.out.println(" Dept : "+dept+" Salary : "+sal);
        }
}
class Part_Time_Staff extends Staff
{
        int hours,rate;

        Part_Time_Staff(String n,String addr,int h,int r)
        {
                super(n,addr);
                hours=h;
                rate=r;
        }

        public void display()
        {
		super.display();
                		
		  System.out.println(" No. Of Hours : "+hours+" Rate Per Hour : "+rate);
        }
}

class Ass3SetB_1 
{
        
        public static void main(String args[]) throws IOException
        {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Total No. of Staff");
                int n=Integer.parseInt(br.readLine());
		Staff[] st=new Staff[n];
                 
	for(int i=0;i<n;i++)
	{
	   System.out.println("********Enter Information of Staff No : "+(i+1)+"*********");
	   System.out.println("Enter Name");
	   String na=br.readLine();
	   System.out.println("Enter Address");
	   String addr=br.readLine();
	  
	   System.out.println("Enter 1:Full Time Staff  2: Part Time Staff");
	   int ch=Integer.parseInt(br.readLine());
	   switch(ch)
	   {
		case 1:System.out.println("Enter Department");
		            
			String dept=br.readLine();
		        System.out.println("Enter Salary");
	   		int sal=Integer.parseInt(br.readLine());
		st[i]=new Full_Time_Staff(na,addr,dept,sal);
		break;
		case 2:System.out.println("Enter Number of hours");
		            int h=Integer.parseInt(br.readLine());
		           System.out.println("Enter rate");
		            int r=Integer.parseInt(br.readLine());
		st[i]=new Part_Time_Staff(na,addr,h,r);
		break;
	   }
	}
	

	for(int i=0;i<n;i++)
	   st[i].display();
             
	                             
        }
         
}



