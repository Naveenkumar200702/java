package stringPrograms;
import java.util.Scanner;
public class SwapWithoutVariable {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int number1=sc.nextInt();
		System.out.println("Enter Second Number");
		int number2=sc.nextInt();
		number1+=number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("first number "+number1);
		System.out.println("Second number "+number2);
		sc.close();
		
	}
}
