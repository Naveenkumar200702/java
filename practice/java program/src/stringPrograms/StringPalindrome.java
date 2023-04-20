package stringPrograms;
import java.util.*;
public class StringPalindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String string=sc.nextLine();;
		int j=string.length()-1;
		String reverseString="";
		while(j>=0)
		{
			reverseString+=string.charAt(j);
			j--;
		}
		if(string.equals(reverseString))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}	
	}
}
