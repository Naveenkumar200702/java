import java.util.*;
public class ninetyTwoA{
	static int sort(char[] ch,int start,int check)
	{
		if(start<ch.length)
		{
			if(check<ch.length)
			{
				if(ch[start]>ch[check])
				{
					char temp=ch[start];
					ch[start]=ch[check];
					ch[check]=temp;
					check++;
					return sort(ch,start,check);
				}
				else
				{
					check++;
					return sort(ch,start,check);
				}
				
			}
			else
			{
				start++;
				check=start+1;
				return sort(ch,start,check);
			}
		}
		else
		{
			return 1;
			
		}	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		sort(ch,0,1);
		for(char c:ch)
		{
			System.out.println(c);
		}
	}
}
		