import java.util.*;
public class two{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		char c=sc.next().charAt(0);
		char check;
		if(c>='a'&&c<='z')
		{
			check='z';
		}
		else if(c>='A'&&c<='Z')
		{
			check='Z';
		}
		else
		{
			check=0;
			System.out.println("Enter a valid input");
		}	
		for(int i=c;i<=check;i++)
		{
			System.out.printf("%c",i);
		}
	}
}