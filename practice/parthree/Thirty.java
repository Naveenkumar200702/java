import java.util.*;
public class Thirty{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number1");
		int Number1=sc.nextInt();
		System.out.println("enter the Number2");
		int Number2=sc.nextInt();
		System.out.println("enter the Number3");
		int Number3=sc.nextInt();
		if(Number1>Number2)
		{
			if(Number1>Number3)
			{
				System.out.println("Largest number = "+Number1);
			}
			else
			{
				System.out.println("Largest number = "+Number3);
			}
		}
		else
		{
			if(Number2>Number3)
			{
				System.out.println("Largest number = "+Number1);
			}
			else
			{
				System.out.println("Largest number = "+Number3);
			}
		}	
	}
}