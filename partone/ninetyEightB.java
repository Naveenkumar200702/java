import java.util.*;
public class ninetyEightB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a small character Value");
		char c=sc.next().charAt(0);
		if(c>='a'&&c<='z')
		{
			int n=(int)c-32;
			c=(char)n;
			System.out.println(c);
			
		}
		else if(c>='A'&&c<='Z')
		{
			System.out.println(c);
		}
		else
		{
			System.out.println("Enter a valid character");
		}
	}
}