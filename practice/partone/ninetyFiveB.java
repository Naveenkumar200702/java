import java.util.*;
public class ninetyFiveB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int start=0,end=s.length()-1;
		while(start<=end)
		{
			if(s.charAt(start)==s.charAt(end))
			{
				if(start==end)
				{
					System.out.println("palindrome");
				}
				start++;
				end--;
			}
			else
			{
				System.out.println("not a palindrome");
				break;
			}
		}
	}
}