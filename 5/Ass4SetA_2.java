import java.io.*;
class InSufficientFundException extends Exception
{
	public InSufficientFundException()
	{
		System.out.println("InSufficient Funds");
	}
}
class SavingsAccount
{
    int acno;
    String name;
    double balance; 
    
    public SavingsAccount(int ano,String n,double b)
    {
        acno=ano;
	name=n;
	balance=b;
    }
    
   public void viewBalance()
   {
	System.out.println("Account Number : " +acno ); 
       System.out.println("Name: " + name);
      
       System.out.println("The balance is: " + balance); 
   }
  
   public void deposit(double amount)
   {
       balance += amount; 
	
   }
   
   public void withdraw(double amount)
   {
	try
	{
	if(balance>= 500 && balance> amount)
		throw new InSufficientFundException();
	else
	balance-=amount;
        }
	catch(InSufficientFundException e) 
	{
	}

   }
   
   
   
}
//end of SavingsAccount class


class Ass4SetA_2
{
	
	public static void main(String args[]) throws IOException
	{
		SavingsAccount s=new SavingsAccount(1,"abc",500);	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int ch;
	do
	{
	System.out.println("Enter \n1.View Balance\n2.Withdraw\n3.Deposit\n4.Exit");
	ch=Integer.parseInt(br.readLine());
	
	   switch(ch)
	   {
		case 1:s.viewBalance();break;
		case 2:System.out.println("Enter Amount to Withdraw");
			double amt=Double.parseDouble(br.readLine());
			s.withdraw(amt);
			break;
		case 3:System.out.println("Enter Amount to Deposit");
			double amt1=Double.parseDouble(br.readLine());
			s.deposit(amt1);
			break;
	    }
	}while(ch!=4);
	}
}

