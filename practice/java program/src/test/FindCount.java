package test;
import java.util.*;
public class FindCount {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first input string");
	String inputString=sc.nextLine();
	System.out.println("enter the referal String");
	String refString=sc.nextLine();
	char[] ref=refString.toCharArray();
	int count[]=new int[refString.length()];
	for(int i=0;i<ref.length;i++)
	{
		for(int j=0;j<inputString.length();j++)
		{
			if(ref[i]==inputString.charAt(j))
			{
				count[i]++;
			}
		}
	}
	for(int i=0;i<count.length;i++)
	{
		System.out.println(ref[i] +":"+ count[i]);
	}
}
}
