package assesment_feb_end;

import java.util.Scanner;

public class PatternPrinting {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter input");
		int number=input.nextInt();
		int result=0;
		for(int i=1;i<=number;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j==0)
				{
					System.out.print(i+" ");
					result+=i;
					continue;
				}
				result+=number-j;
				System.out.print(result+" ");
			}
			result=0;
			System.out.println();
		}
	}
}
