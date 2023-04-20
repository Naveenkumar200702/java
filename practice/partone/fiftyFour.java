import java.util.*;
public class fiftyFour{
	
	static int[] sort(int arr1[],int n)
	{
		
		for(int i=0;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(arr1[i]>arr1[j])
				{
					int temp=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		return arr1;
	}
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arrE[]=new int[n];
		int arrO[]=new int[n];
		int even=0,odd=0,id=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				arrE[even]=arr[i];
				even++;
			}
			else
			{
				arrO[odd]=arr[i];
				odd++;
			}		
		}
		int arrEven[]=sort(arrE,even);
		int arrOdd[]=sort(arrO,odd);
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(arrOdd[odd--]);
			}
			else 
			{
				System.out.println(arrEven[id++]);
			}
		}
		
		
					
	}
}
						