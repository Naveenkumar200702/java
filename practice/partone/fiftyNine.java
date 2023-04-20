import java.util.*;
public class fiftyNine{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the main String");
		String str=sc.nextLine();
		System.out.println("Enter the subString");
		String substr=sc.nextLine();
		int first=-1,i=0,j=0;
		boolean one=false,two=true;
		while(i<str.length())
		{
				
			while(j<substr.length())
			{		
			if(i<str.length())
			{
				if(str.charAt(i)==substr.charAt(j))
				{
					i++;
					j++;
					one=true;
				}
				else
				{
					one=false;
					j=0;
					break;
				}
			}
			else
			{
				one=false;
				break;
			}
					
			}			
			i++;
			if(one==true)
			{
				first=i-substr.length();
				one=false;
			}
			else
			{
				two=true;
				one=false;
			}
			
		}
			System.out.println(first);
	}
}