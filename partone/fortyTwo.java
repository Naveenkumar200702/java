import java.util.*;
public class fortyTwo{
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
		int count=1,i=0,j=1;;
		
			while(j<len)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				else
				{
					System.out.println(arr[i]+" frequency is "+count );
					count=1;
					i=j;
					
					
				}
				if(j==len-1)
				{
					System.out.println(arr[j-1]+" frequency is "+count);
				}
				j++;
			}
		
				
				
	}
}