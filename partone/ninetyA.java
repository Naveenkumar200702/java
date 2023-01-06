import java.util.*;
public class ninetyA{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of words array");
		int len=sc.nextInt();
		System.out.println("enter the words");
		String str[]=new String[len];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		int index=0;
		for(int i=0;i<len;i++)
		{
			String temp="";
			for(int j=i+1;j<len;j++)
			{
					while(str[i].charAt(index)==str[j].charAt(index))
					{
						index+=1;
					}
					if(str[i].charAt(index)>str[j].charAt(index))
					{
						temp=str[i];
						str[i]=str[j];
						str[j]=temp;
						index=0;
					}
			}
		}
		System.out.println("output");
		for(String i:str)
		{
			System.out.println(i);
		}
		
	}
}