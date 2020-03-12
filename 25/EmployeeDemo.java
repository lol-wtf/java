import java.io.*;
class Employee
{
	int empID;
	String name;
	String department;
	int salary;
	public Employee()
	{
		
	}
	public Employee(int eid,String n,String depart,int sal)
	{
		empID=eid;
		name=n;
		department=depart;
		salary=sal;
	}

	void accept() throws IOException
	{
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("\n\t***************EMPLOYEE DETAILS*************\n");
		System.out.println("ENTER THE EMPLOYEE ID");
		empID=Integer.parseInt(br.readLine());
		System.out.println("ENTER THE NAME OF EMPLOYEE");
		name=br.readLine();
		System.out.println("ENTER THE DEPARTMENT");
		department=br.readLine();
 		System.out.println("ENTER THE SALARY");
		salary=Integer.parseInt(br.readLine());
		
	}
	
	
	void display()
	{
	System.out.println("\n\t\tEMPLOYEE-ID ="+empID+" ,
	\n\t\tEMPLOYEE-NAME ="+name+"
	\n\t\tDEPARTMENT ="+department+"\n\t\tSALARY"+salary);
	}
}

class Manager extends Employee
{
	 int bonus,total;
	void accept() throws IOException
	{	
		BufferedReader br;
                br = new BufferedReader(new InputStreamReader (System.in));
		super.accept();
		System.out.println("ENTER THE BONUS : ");
		bonus=Integer.parseInt(br.readLine());
		total=salary+bonus;
		
	}

	void display()
	{
		super.display();
		System.out.println("\n\t\tBONUS ="+bonus); 
	}

	
}

class EmployeeDemo
{

	public static void main(String[] args) throws IOException
	{
		int i,n;
		int maxsal=0;
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("\n\t\tHOW MANY ManagerS DO YOU WANT : ");
		n=Integer.parseInt(br.readLine());
		Manager arr[]=new Manager[n];
		for(i=0;i<n;i++)
		{
			arr[i]=new Manager();
			arr[i].accept();
			
			if(maxsal<arr[i].total)
				maxsal=arr[i].total;
		}
		System.out.println("\n\t\tManagerS Having Maximum 
		Salary : ");		
		for(i=0;i<n;i++)
		{
			if(maxsal==arr[i].total)
			arr[i].display();
		}
		

	}


}
