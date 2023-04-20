import java.util.*;
public class ninetyFiveA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			stk.push(s.charAt(i));
		}
		int check=0;
		for(int i=0;i<s.length();i++)
		{
			char c=stk.pop();
			if(s.charAt(i)==c)
			{
				check++;
			}
			else
			{
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(check==s.length())
		{
			System.out.println("palindrome");
		}
	}
}