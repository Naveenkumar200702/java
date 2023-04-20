package stringPrograms;
import java.util.*;
public class PrimeorNot {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find prime or not");
		int number=sc.nextInt();
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("prime number");
	}
}
