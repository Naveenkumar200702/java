package test;
import java.util.*;
public class ValidParanthesis {
	static boolean checkParenthesis(String input)
	{
		Stack stk=new Stack();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='(')
			{
				stk.push('(');
			}
			else if(input.charAt(i)==')')
			{
				if(!stk.isEmpty())
				{
					stk.pop();
				}
				else
				{
					return false;
				}
			}
		}
		return stk.isEmpty();
	}
	static boolean checkEquation(String input)
	{
		boolean check=true;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='*'||input.charAt(i)=='/'||input.charAt(i)=='%'||input.charAt(i)=='+'||input.charAt(i)=='-')
			{
				if(i>=1&&i<input.length()-1)
				{
					if((input.charAt(i-1)>='a'&&input.charAt(i-1)<='z')&&(input.charAt(i+1)>='a'&&input.charAt(i+1)<='z'))
					{
						check=true;
					}
					else return false;
				}
				else return false;
			}
			
		}
		return check;		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an input");
		String input=sc.nextLine();
		boolean parenthesis=checkParenthesis(input);
		boolean equation=checkEquation(input);
		if(parenthesis&&equation)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
