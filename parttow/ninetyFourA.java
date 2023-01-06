import java.util.*;
public class ninetyFourA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first Word");
		String str1=sc.nextLine();
		System.out.println("enter the second word");
		String str2=sc.nextLine();
		str1.toLowerCase();
		str2.toUpperCase();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		if(str1.length()!=str2.length())
		{
			System.out.println("not a anagrams");
		}
		else
		{
			for(int i=0;i<ch1.length;i++)
			{
				for(int j=0;j<ch1.length-1;j++)
				{
					if(ch1[j]>ch1[j+1])
					{
						char temp=ch1[j];
						ch1[j]=ch1[j+1];
						ch1[j+1]=temp;
					}
					if(ch2[j]>ch2[j+1])
					{
						char temp1=ch2[j];
						ch2[j]=ch2[j+1];
						ch2[j+1]=temp1;
					}
				}
			}
			str1=String.valueOf(ch1);
			str2=String.valueOf(ch2);
			if(str1.equals(str2))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
	}
}
