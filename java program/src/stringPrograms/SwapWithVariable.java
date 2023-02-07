package stringPrograms;
import java.util.Scanner;
public class SwapWithVariable {
	public static void maint(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int number1=sc.nextInt();
		System.out.println("Enter Second Number");
		int number2=sc.nextInt();
		int temp=0;
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("first number "+number1);
		System.out.println("Second number "+number2);
		
	}
}
