import java.util.*;
public class five
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		char c=sc.next().charAt(0);
		char check;
		if(c>='a'&&c<='z')
		{
			check='a';
		}
		else if(c>='A'&&c<='Z')
		{
			check='A';
		}
		else
		{
			check=0;
			System.out.println("Enter a valid input");
		}	
		for(int i=c;i>=check;i--)
		{
			for(int j=i;j>=check;j--)
			{
				System.out.printf("%c",i);
			}
			System.out.println();
		}
		
		
	}
}