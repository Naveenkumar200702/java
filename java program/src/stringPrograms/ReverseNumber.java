package stringPrograms;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int number=sc.nextInt();
		int reverse=0;
		while(number!=0)
		{
			int num=number%10;
			reverse=reverse*10+num;
			number/=10;
		}
		System.out.println("reversed number "+reverse);
		sc.close();
	}
}
