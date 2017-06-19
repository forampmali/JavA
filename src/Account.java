class Accountdetail
{  
	int acc_no;  
	String name;  
	float amount;  
	void insert(int a,String n,float amt)
	{  
		acc_no=a;  
		name=n;  
		amount=amt;  
	}
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	} 
	
	void deposit(float amt)
	{  
		amount=amount+amt;  
		System.out.println(amt+" deposited");  
	}  
	
	void withdraw(float amt)
	{  
		if(amount<amt)
		{  
			System.out.println("Insufficient Balance");  
		}
		else
		{  
			amount=amount-amt;  
			System.out.println(amt+" withdrawn");  
		}  
	}  
	void checkBalance()
	{
		System.out.println("Balance is: "+amount);
	}  
	 
	}  
	  
class Account
{  
	public static void main(String[] args)
	{  
		Accountdetail a1=new Accountdetail();  
		a1.insert(143143,"Foram",5000);  
		a1.display();  
		a1.checkBalance();  
		a1.deposit(50000);  
		a1.checkBalance();  
		a1.withdraw(57000);  
		a1.checkBalance();  
}}  