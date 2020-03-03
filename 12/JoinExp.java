class JoinExp extends Thread
{ 
	int sum;
	public void run()
	{  
      		for(int i=1;i<=100;i++)
		{  
      			int n =(int)Math.round(Math.random()*100);
       			sum=sum+n;        
      		} 
	System.out.println("sum "+sum);  
     }  
    public static void main(String args[])
    {  
	
	JoinExp[] t =new JoinExp[10];
	for(int i=0;i<10;i++)
	{
		t[i]= new JoinExp();
		t[i].start();
	}
       	try
	{
	for(int i=0;i<10;i++) 
      	t[i].join();  
        }
	catch(Exception e)
	{
	System.out.println(e);
	}  
      	double s=0;
	for(int i=0;i<10;i++)
	s=s+t[i].sum; 
	double favg=s/1000;
	System.out.println("Average of 1000 Numbers = "+favg);
     }  
    }  
