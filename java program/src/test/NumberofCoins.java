package test;
import java.util.*;
public class NumberofCoins {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> map=new HashMap<>();
		System.out.println("enter No of one rupee coins");
		int oneRupee=sc.nextInt();
		map.put(1,oneRupee);
		System.out.println("enter No of two rupee coins");
		int twoRupee=sc.nextInt();
		map.put(2,twoRupee);
		System.out.println("enter No of five rupee coins");
		int fiveRupee=sc.nextInt();
		map.put(5, fiveRupee);
		System.out.println("enter No of ten rupee coins");
		int tenRupee=sc.nextInt();
		map.put(10,tenRupee);
		System.out.println("enter the total amount");
		int totalAmount=sc.nextInt();
		int totalCoins=(oneRupee)+(twoRupee*2)+(fiveRupee*5)+(tenRupee*10);
		if(totalAmount>totalCoins)
		{
			System.out.println("Total amount greater than given coins");
			return;
		}
		
		int amount[][]=new int[2][4];
		amount[1][0]=oneRupee;
		amount[1][1]=twoRupee;
		amount[1][2]=fiveRupee;
		amount[1][3]=tenRupee;
		amount[0][0]=1;
		amount[0][1]=2;
		amount[0][2]=5;
		amount[0][3]=10;
		boolean check=true;
		while(check)
		{
			
		}
		
		
	}
}
