package collections;
import java.util.*;
 abstract class Accout {
	List<Integer>list=new ArrayList<>();
	List<Integer>pin=new ArrayList<>();
	List<String>name=new ArrayList<>();
	List<Integer>amount=new ArrayList<>();
	abstract void verify();
	void  Number()
	{ 
	  list.add(123);
	  name.add("mansoor");
	  pin.add(123);
	  amount.add(100);
	  list.add(345);
	  name.add("basha");
	  pin.add(123);
	  amount.add(100);
	  list.add(678);
	  name.add("sai teja");
	  pin.add(123);
	  amount.add(100);
	  list.add(1122);
	  name.add("satish");
	  pin.add(123);
	  amount.add(100);
	}
	void addNumber(int number,String name1,int pin1)
	{
		list.add(number);
		name.add("name1");
		pin.add(pin1);
		amount.add(0);
	}
	boolean verification(int number,int pins)
	{ 
		boolean flag=false;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==number)
			{
				if(pin.get(i)==pins)
				{ 
					flag=true;
					return true;
				
				}
				else
				{ flag=false;
					return false;
				}
			}
		}
		if(flag==false)
		{
		return false;
		}
		else
		{
			return true;
		}
	}
	void Deposite(int amount1,int number)
	{ 
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==number)
			{
				int c=amount.get(i);
				c+=amount1;
				amount.add(i,c);
				break;
			}
		}
	  	}
	void withdraw(int amount1,int number)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==number)
			{
				int c=amount.get(i);
				c-=amount1;
				amount.add(i,c);
				break;
			}
		}
			}
	int checkbalance(int num)
	{
		int c=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==num)
			{
				 c+=amount.get(i);
				break;
			}
		}
		return c;
	}
}
public class Accounts extends Accout{
	void verify()
	{
		System.out.print("hide the implementation");
	}
	public static void main(String[] args)
	{
		Accout c=new Accounts();
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO MANSOOR BANK OF INDIA");
		System.out.println("options");
		System.out.println("--------------------------------------------------");
		System.out.println("1.create new account");
		System.out.println("2. Existing account");
		int option=sc.nextInt();
		switch(option)
		{
		case 1 :
		{
			System.out.println("AccountNumber:");
			int number=sc.nextInt();
			System.out.println("EnterPin:");
			int pin=sc.nextInt();
			System.out.println("AccoutHolderName:");
			String na=sc.next();
			c.addNumber(number,na,pin);
             System.out.println("Enter AccountNumber and pinNumber:");
			
			if(c.verification(sc.nextInt(),sc.nextInt()))
			{
				System.out.println("WELCOME TO MANSOOR BANK OF INDIA");
				System.out.println("-------------------------------------------------------");
				while(true)
				{
				System.out.println("-------------------------------------------------------");
				System.out.println("Options");
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("3.CheckBalance");
				int option1=sc.nextInt();
				switch(option1)
				{
				case 1:
				{
					System.out.println("AccountNumber:");
					int num=sc.nextInt();
					System.out.println("Enter Amount:");
					int amount=sc.nextInt();
					c.Deposite(amount,num);
					break;
				}
				case 2:
				{
					System.out.println("AccountNumber:");
					int num=sc.nextInt();
					System.out.println("Enter Amount:");
					int amount=sc.nextInt();
					c.withdraw(amount,num);
					break;
				}
				case 3:
				{
					System.out.println("AccountNumber:");
					int num=sc.nextInt();
					System.out.println("AccountBalance:"+c.checkbalance(num));
					break;
				}
				default:
				{
				System.out.println("Incorrect option");
				}
				}
				}
			}
			else
			{
				System.out.println("Account not found");
			}
		}
		case 2:
		{
			c.Number();
			System.out.println("Enter AccountNumber and pinNumber:");
			
			if(c.verification(sc.nextInt(),sc.nextInt()))
			{
				System.out.println("WELCOME TO MANSOOR BANK OF INDIA");
				System.out.println("-------------------------------------------------------");
				while(true)
				{
				System.out.println("-------------------------------------------------------");
				System.out.println("Options");
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("3.CheckBalance");
				int option1=sc.nextInt();
				switch(option1)
				{
				case 1:
				{
					System.out.println("AccountNumber:");
					int number=sc.nextInt();
					System.out.println("Enter Amount:");
					int amount=sc.nextInt();
					c.Deposite(amount,number);
					break;
				}
				case 2:
				{
					System.out.println("AccountNumber:");
					int num=sc.nextInt();
					System.out.println("Enter Amount:");
					int amount=sc.nextInt();
					c.withdraw(amount,num);
					break;
				}
				case 3:
				{
					System.out.println("AccountNumber:");
					int num=sc.nextInt();
					System.out.println("AccountBalance:"+c.checkbalance(num));
					break;
				}
				default:
				{
				System.out.println("Incorrect option");
				}
				}
				}
			}
		}
		
		}
	}
}
