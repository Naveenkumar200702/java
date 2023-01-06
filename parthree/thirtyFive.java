import java.util.*;
public class thirtyFive{
	static int fac=1;
	static int Factorial(int Num)
	{ 
		fac=Num;
		if(Num>1)
		{
			return fac*Factorial(Num-1);
		}
		else
		{
			return 1;
		}
	}
	static int summ=0;
	static int sum(int number)
	{
		if(number>9)
		{
			summ=summ+number%10;
			number=number/10;
			return sum(number);
		}
		else
		{
			return summ+number;
		}
	}
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int number=sc.nextInt();
		int Fact=Factorial(number);
		System.out.println(Fact);
		int sumOfDigits=sum(Fact);
		System.out.println(sumOfDigits);
	}
}
		