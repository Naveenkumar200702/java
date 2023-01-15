package consoleprogram;

import java.util.*;
class userDetails{
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	HashMap<Integer,String> name=new HashMap<Integer,String>();
	HashMap<Integer,Integer> balance=new HashMap<Integer,Integer>();
	Scanner sc=new Scanner(System.in);
	userDetails(){
		data.put(123456,2244);
		data.put(123455,2244);
		data.put(112233,1122);
		data.put(6385300,1234);
		name.put(6385300,"Suja");	
		name.put(123456,"siva");
		name.put(123455,"merlin");
		name.put(112233,"poornisha");
		balance.put(123456,10000);
		balance.put(123455,8000);
		balance.put(112233,100000);
		balance.put(6385300,500000);
	}
	void checkBalance(int acNo)
	{
		System.out.println("your current balance is Rs."+balance.get(acNo));
	}
	
	void bankTransfer(int amount,int sender)
	{
		checking obj=new checking();
		System.out.println("enter acount no to transfer");
		int receiver=sc.nextInt();
		if(!obj.checkAccount(receiver))
		{
			System.out.println("account number is wrong");
			return;
		}
		int senderamount=balance.get(sender);
		senderamount-=amount;
		balance.put(sender,senderamount);
		int receiveramount=balance.get(receiver);
		receiveramount+=amount;
		balance.put(receiver,receiveramount);
		System.out.println("amount transfered successfully");
	}
}
class checking extends userDetails{
	void withDraw(int amountt,int actNo)
	{
		if(amountt>balance.get(actNo))
		{
			System.out.println("enter a amount less than ur balance");
			return;
		}
		if(amountt%100==0||amountt%200==0||amountt%500==0||amountt%2000==0)
		{
			int balanceAmt=balance.get(actNo);
			balanceAmt-=amountt;
			balance.put(actNo,balanceAmt);
			System.out.println("please get ur cash");
		}
		else System.out.println("enter a valid amount to withdraw");	
	}
	boolean checkAccount(int accountNo)
	{
		if(data.get(accountNo)==null)
		{
			System.out.println("enter a valid accountNumber");
			return false;
		}
		return true;
	}
	boolean checkPassword(int accountNo,int password)
	{
		if(data.get(accountNo)==password)
		{
			System.out.println("welcome "+ name.get(accountNo)+",");
			System.out.println();
		}
		else{	
			System.out.println("enter a valid password");
			return false;
		}
		return true;		
	}
	boolean checkAmount(int amount,int acNo)
	{
		if(amount>balance.get(acNo))
			return false;
		return true;
	}
}
public class Atm extends checking{
	Scanner sc=new Scanner(System.in);
	void index()
	{
			System.out.println("\t\twelcome to our ATM service");
			System.out.println();
			System.out.println("enter the Account no");
			int acountNo=sc.nextInt();
			if(!checkAccount(acountNo))
				return;
			System.out.println("enter the pincode");
			int password=sc.nextInt();
			if(!checkPassword(acountNo,password))
				return;
			specification(acountNo);
	}
void specification(int accountNo)
{
			System.out.println("1) cash withdraw");
			System.out.println("2) balance enquiry");
			System.out.println("3) bank Transfer");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("enter the amount to withdraw");
				int withdrawAmount=sc.nextInt();
				withDraw(withdrawAmount,accountNo);
			}
			else if(option==2)
			{
				checkBalance(accountNo);
			}
			else if(option==3)
			{
				System.out.println("enter the amount to transfer");
				int amt=sc.nextInt();
				if(checkAmount(amt,accountNo))
					bankTransfer(amt,accountNo);
				else 
					System.out.println("your Balance is low");
			}
			else
			{
				System.out.println("enter a valid number");
			}
			System.out.println("Do you want to continue? y/n");
			char c=sc.next().charAt(0);
			if(c=='y'||c=='Y')
			{
				specification(accountNo);
			}
			else
			{
				System.out.println("Thank you for using us");
			}
		}

	public static void main(String[] args)
	{	
		Atm ob=new Atm();
		ob.index();	
	}
}
