import java.util.*;
public class ninetySevenB{
	static int binary(char ch[],char des,int low,int high)
	{
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(ch[mid]==des)
			{
				System.out.println("match found");
				return 1;
			}
			else if(des>ch[mid])
			{
				return binary(ch,des,mid+1,high);
			}
			else
			{
				return binary(ch,des,low,mid-1);
			}
		}
		else
		{
			System.out.println("match not found");
			
			return 0;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		System.out.println("enter the character to find");
		char find=sc.next().charAt(0);
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length-1-i;j++)
			{
				if(c[j]>c[j+1])
				{
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		
		binary(c,find,0,c.length-1);
	}
}