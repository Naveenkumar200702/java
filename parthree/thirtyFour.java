import java.util.*;
public class thirtyFour{
	static int num1;
	static int findLargest(int num)
	{
		if(num!=0)
		{
			if(num1<num%10)
			{
				num1=num%10;
				return findLargest(num/10);
			}
			else
			{
				return findLargest(num/10);
			}
		}
		else
		{
			return num1;
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=number*(number+1)/2;
		System.out.println("sum of natural number "+sum);
		int largestDigit=findLargest(sum);
		System.out.println("Largest digit is " + largestDigit);	
	}
}
		