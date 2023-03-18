package pattern;

import java.util.Scanner;

public class Patern3 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int n=input.nextInt();
		int rowVal=1;
		int colVal=0;
		for(int i=0;i<n;i++)
		{
			colVal=rowVal;
			int m=n-i;
			for(int j=0;j<=i;j++)
			{
				if(j==0)
					System.out.print(rowVal+" ");
				else{
					colVal-=m;
					System.out.print(colVal+" ");
					m++;
				}
			}
			rowVal+=n-i;
			System.out.println();
		}
	}

}
