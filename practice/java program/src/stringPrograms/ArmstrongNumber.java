package stringPrograms;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int number1=number;
		int number2=0;
		String str=Integer.toString(number);
		int sqr=str.length();
		while(number1!=0)
		{
			int n=number1%10;
			number1/=10;
			number2+=Math.pow(n,sqr);
			
		}
		if(number2==number)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
}
