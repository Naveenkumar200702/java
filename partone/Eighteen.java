import java.util.*;
public class Eighteen{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int a=sc.nextInt();
		System.out.println("enter number2");
		int b=sc.nextInt();
		System.out.println(++a-b);
		System.out.println(a%b++);
		System.out.println(a+" "+b);
		System.out.println(a*=b+5);
		System.out.println(69>>>2);
		
	}
}