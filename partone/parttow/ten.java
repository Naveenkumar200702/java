import java.util.*;
public class ten{
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
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(i%2==0)
				{
					if(arr[i]<arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				else
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		System.out.println("output");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
						