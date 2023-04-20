import java.util.*;
public class fortyfour{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
				}
			}
		}
	
		int i=0,x=-1;
		System.out.println("repeated elements");
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					if(arr[j]!=x)
					{
						x=arr[j];
						System.out.print(x+",");
					}
					
				}
				else
				{
					i=j;
					
				}
					
			}
	}
}