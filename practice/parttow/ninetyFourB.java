import java.util.*;
public class ninetyFourB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=sc.nextLine();
		System.out.println("enter the second string");
		String str2=sc.nextLine();
		str1.toLowerCase();
		str2.toLowerCase();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		if(ch1.length!=ch2.length)
		{
			System.out.println("not anagrams");
		}
		else
		{
			for(int i=0;i<ch1.length;i++)
			{
				for(int j=0;j<ch2.length;j++)
				{
					if(ch1[i]==ch2[j])
					{
						ch2[j]=' ';
						break;
					}
				}
			}
		}
		boolean check=true;
		for(char a:ch2)
		{
			if(a!=' ')
			{
				check=false;
				System.out.println("not a anagram");
				break;
			}
		}
		if(check)
		{
			System.out.println("anagram");
		}
	}
}