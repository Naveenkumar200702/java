import java.util.*;
public class nineteen{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		a+=a++ + ++a+-a+a;
		System.out.println(a);
	}
}