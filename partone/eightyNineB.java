import java.util.*;
public class eightyNineB
{
	static String[] splitString(String str,char check)
	{
		char ch[]=str.toCharArray();
		int size=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==check)
			{
				size++;
			}
		}
		String[] arr=new String[size+1];
		int j=0;
		String temp="";
		for(int i=0;i<ch.length;i++)
		{
			
			if(check==ch[i])
			{
				arr[j]=temp;
				j++;
				temp="";
			}
			else if(i==ch.length-1)
			{
				arr[j]=temp;
				j++;
				temp="";
			}
			else
			{
				temp+=ch[i];
			}
		}
		return arr;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to split");
		String str=sc.nextLine();
		String[] st=splitString(str,' ');
		for(String i:st)
		{
			System.out.println(i);
		}
		
	}
}