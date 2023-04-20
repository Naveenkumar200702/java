import java.util.*;
public class ninetySevenA{
	
	
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
		int low=0,high=c.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(c[mid]==find)
			{
				System.out.println("match found");
				break;
			}
			else if(find>c[mid])
			{
				low=mid+1;
			}
			else 
			{
				high=mid-1;
			}
		}
	}
}