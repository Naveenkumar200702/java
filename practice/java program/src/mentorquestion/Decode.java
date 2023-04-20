package mentorquestion;

import java.util.Stack;

public class Decode {
	public static void  main(String[] args) {
		//String str="IIII";
		String str="IIDDIDID";  
		Stack<Integer> stk=new Stack<>();
		String result="";
		if(str.length()>8)
		{
			System.out.println("Too long");
			return;	
		}
			
		for(int i=0;i<=str.length();i++)
		{
			stk.push(i+1);
			if(i==str.length()||str.charAt(i)=='I')
			{
				while(!stk.isEmpty())
				{
					result+=String.valueOf(stk.pop());
				}
			}
		}
		System.out.println(result);
	}
	
}
