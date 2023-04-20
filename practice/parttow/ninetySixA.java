import java.util.*;
public class ninetySixA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("enter Target");
		char c=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				System.out.println("match found");
			}
		}
	}
}