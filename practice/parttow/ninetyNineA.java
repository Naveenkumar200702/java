import java.util.*;
public class ninetyNineA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				int n=(int)c;
				n-=32;
				c=(char)n;
				s1+=c;
			}
			else
			{
				s1+=c;
			}
		}
		System.out.println(s1);
	}
}