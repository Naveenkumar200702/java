import java.util.*;
public class fiftyTwo{
	static String recursion(String str,int end)
	{
		String rev="",words="";
		
		while(end!=-1)
		{
			if(str.charAt(end)==' ')
			{
				words=words+rev+" ";
				rev="";
				recursion(str,end-1);
			}
			else
			{
				rev=str.charAt(end)+rev;
			}
			end--;
		
		}
		return words+rev;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		int end=str.length()-1;
		System.out.println(recursion(str,end));
	}
}