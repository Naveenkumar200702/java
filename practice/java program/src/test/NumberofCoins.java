package test;
import java.util.*;
public class NumberofCoins {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	/*	System.out.println("enter No of one rupee coins");
		int oneRupee=sc.nextInt();
		System.out.println("enter No of two rupee coins");
		int twoRupee=sc.nextInt();
		System.out.println("enter No of five rupee coins");
		int fiveRupee=sc.nextInt();
		System.out.println("enter No of ten rupee coins");
		int tenRupee=sc.nextInt();
		
		int totalCoins=(oneRupee)+(twoRupee*2)+(fiveRupee*5)+(tenRupee*10);
		if(totalAmount>totalCoins)
		{
			System.out.println("Total amount greater than given coins");
			return;
		}*/
		
	/*	int value[]= {1,2,5,10};
		int coins[]=new int[4];
		coins[0]=oneRupee;
		coins[1]=twoRupee;
		coins[2]=fiveRupee;
		coins[3]=tenRupee;*/
		System.out.println("enter the total amount");
		int totalAmount=sc.nextInt();
		int coinNo=0;
		int amount=totalAmount;
		int temp;
		
			if(amount%10>=8)
			{
				coinNo=amount/10;
				amount=amount%10;
			
			}
			else
			{
				coinNo=(amount/10)-1;
				amount=(amount%10)+10;
			}
			System.out.println("10 rupee coins "+coinNo);
			temp=coinNo;
			if(amount%5>=3)
			{
				coinNo=amount/5;
				amount=amount%5;
			}
			else
			{
				coinNo=(amount/5)-1;
				amount=(amount%10)+5;
			}
			System.out.println("5 rupee coin " + (coinNo-temp));
			temp =coinNo+temp;
			if(amount%2>=1)
			{
				coinNo=(amount/2);
				amount=amount%2;
			}
			else
			{
				coinNo=(amount/2)-1;
				amount=(amount%2)+1;
			}
			System.out.println(" 2 rupee coin "+(coinNo-temp));
			temp+=coinNo;
			System.out.println(" 1 rupee coin "+ amount);
			coinNo=amount;
			System.out.println("total coins"+coinNo);
	
	}
}
