package myprograms;
import java.util.*;
public class NumberOfCoins {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int coins[]= {1,2,5,10};
		int minimum[]= {8,3,1,0};
		int noOfcoins[]= {10,8,14,10};
		System.out.println("enter the coins");
		/*for(int i=0;i<noOfcoins.length;i++)
		{
			System.out.println("enter the "+coins[i]+"Rs coin");
			noOfcoins[i]=sc.nextInt();			
		}*/
		System.out.println("enter the target");
		int target=sc.nextInt();
		int result[]=new int[4];
		int val;
		int i=0,j=coins.length-1;
		int coinslength=coins.length-1;
		int index=0;
		int min=0;
		int total=0;
		for(int k=0;k<coins.length;k++)
		{
			total+=noOfcoins[i]*coins[i];
		}
		if(total==target)
		{
			System.out.println(Arrays.toString(noOfcoins));
			return;
		}
		
		while(target!=0)
		{
			if(j==-1)
			{
				break;
			}
				if(target/coins[j]<=noOfcoins[j])
				{
					result[index]=target/coins[j];
					target=target%coins[j];
				}
				else {
					result[index]=target/noOfcoins[i];
					target=target%noOfcoins[i];
				}	
			
			index++;
			j--;
			i++;
		}
		System.out.println(Arrays.toString(result));
	}

}
