package pattern;

import java.util.Scanner;

public class Patern6 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the rows");
		int n=input.nextInt();
		System.out.println("enter the number of x");
		int cnt=input.nextInt();
		boolean ismid=false;
		int val=0;
		for(int i=0;i<n;i++)
		{
			int start=i;
			int k=n-i-1;
			for(int j=0;j<n*cnt-(cnt-1);j++)
			{
				if(i==0||i==n-1)
					System.out.print("* ");
				else if(start==j)
				{
					System.out.print("* ");
					start=start+n-1;
				}
				else if(k==j)
				{
					System.out.print("* ");
					k=k+n-1;		
				}	
				else
					System.out.print("  ");		
			}
			System.out.println();
		}
	}

}
