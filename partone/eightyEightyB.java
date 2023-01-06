import java.util.*;
public class eightyEightyB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		String str[]=new String[count+1];
		int start=0,end=0,j=0;
		for(int i=0;i<s.length();i++)
		{
			end=i;
			if(s.charAt(i)==' ')
			{
				
				str[j]=s.substring(start,end);
				start=end+1;
				j++;
			}
			else if(i==s.length()-1)
			{
				str[j]=s.substring(start,end+1);
			}
			
		}
		
		
		
		
		
			
		for(String i:str)
		{
			System.out.println(i);
		}
	}
}