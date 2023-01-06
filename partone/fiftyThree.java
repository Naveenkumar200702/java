import java.util.*;
public class fiftyThree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String str=sc.nextLine();
		int len=-1,len1=-1;
		char arr[]=new char[str.length()];
		int arr1[]=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
			{
				len++;
				arr[len]=str.charAt(i);
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				len1++;
				char c=str.charAt(i);
				arr1[len1]=Character.getNumericValue(c);
				if(i+1<str.length())
				{
					if(str.charAt(i+1)>='0'&&str.charAt(i+1)<='9')
					{
						char a=str.charAt(i+1);
						arr1[len1]*=10+Character.getNumericValue(a);
						i++;
					}
				}
			}
		}
		if(len==len1)
		{
			for(int i=0;i<=len;i++)
			{
				for(int j=0;j<arr1[i];j++)
				{
					System.out.print(arr[i]);
				}
			}
		}
	}
}
