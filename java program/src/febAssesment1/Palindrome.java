package febAssesment1;

import java.util.Scanner;

public class Palindrome {
	void findMaxPalindrome(String subString)
	{
		if(subString.length()==1)
		{
			System.out.println("output "+1);
			return;
		}
		
	}
	public static void main(String[] args)
	{
		Palindrome object=new Palindrome();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input");
		String str=input.nextLine();
		System.out.println("Enter number of test cases");
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter starting value");
			int start=input.nextInt();
			System.out.println("Enter ending value");
			int end=input.nextInt();
			object.findMaxPalindrome(str.substring(start-1,end));

		}
	}
}
