import java.io.*;
interface CreditCardInterface
{
        void viewCreditAmount(); 
	void useCard();
        void payCredit();
	void increaseLimit();
}

class SilverCardCustomer implements CreditCardInterface
{
        String name;
	String cardno;
	int cramt,crlimit;
	
        SilverCardCustomer(String n,String cno)
	{
		name=n;
		cardno=cno;
		cramt=0;
		crlimit=50000;
	}

        public void viewCreditAmount()
        {
               System.out.println("Credit Amount = "+cramt); 
        }

        public void useCard()
        {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Amount");
                try{
		int amt=Integer.parseInt(br.readLine());
		cramt=cramt+amt;
		if(cramt>crlimit)
		{
			System.out.println("Transaction failed");
			cramt=cramt-amt; 
		}
		else
		 System.out.println("Transaction Successful");
		}catch(IOException e){}	
        }

        public void payCredit()//throws IOException
        {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Amount to Pay"); 
                try{
		int amt=Integer.parseInt(br.readLine());
		cramt=cramt-amt;
		}catch(IOException e){}	
        }
	public void increaseLimit()//throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Amount to increase"); 
		try{
		int amt=Integer.parseInt(br.readLine());
		crlimit=crlimit+amt;
		}catch(IOException e){}	
	}

}
class GoldCardCustomer extends SilverCardCustomer
{
        String name;
	String cardno;
	int cramt,crlimit;
	
        GoldCardCustomer(String n,String cno)
	{
		super(n,cno);
		cramt=0;
		crlimit=100000;
		
	}

        public void viewCreditAmount()
        {
               System.out.println("Credit Amount = "+cramt); 
        }

        public void useCard()
        {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Amount"); 
                try{
		int amt=Integer.parseInt(br.readLine());
		cramt=cramt+amt;
		if(cramt>crlimit)
		{
			System.out.println("Transaction failed");
			cramt=cramt-amt; 
		}
		else
		 System.out.println("Transaction Successful");
		}catch(IOException e){}		
        }

        public void payCredit()
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Amount to Pay"); 
		try{
		int amt=Integer.parseInt(br.readLine());
		cramt=cramt-amt;	
		}catch(IOException e){}	
        }
	public void increaseLimit()
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Amount to increase"); 
		try{
		int amt=Integer.parseInt(br.readLine());
		if(amt>5000)
			System.out.println("Transaction failed");
		else
			crlimit=crlimit+amt;
		}catch(IOException e){}	
	}

}

class InterfaceDemo
{
	static int cnt=0;
        public static void main(String[] args) throws IOException
        {	
		
		SilverCardCustomer s=new SilverCardCustomer("abc","1234567891234567");
		GoldCardCustomer g=new GoldCardCustomer("xyz","1234567891234567");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enrer 1: Gold Card 2:Silver Card");
	int ch=Integer.parseInt(br.readLine());
	System.out.println("Enter 11.View Credit Amount\n12.Use Card\n13.Pay Credit\n14.Increase Limit");
	int ch1=Integer.parseInt(br.readLine());
	   switch(ch)
	    {
		case 2:switch(ch1)
		{
		   case 11:s.viewCreditAmount();break;
		   case 12:s.useCard();break;	
		   case 13:s.payCredit();break;	
		   case 14:s.increaseLimit();break;			   
		}
		break;
		case 1:switch(ch1)
		{
		   case 11:g.viewCreditAmount();break;
		   case 12:g.useCard();break;	
		   case 13:g.payCredit();break;	
		   case 14:if(cnt<3)
			   {
				g.increaseLimit();
				cnt++;
			   }
			else
				System.out.println("Transaction not Allowed");
			break;
							   
		}
		break;
	   }
	}
                
}

