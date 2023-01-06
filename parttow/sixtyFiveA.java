import java.util.*;
public class sixtyFiveA{
	
	int partition(int arr[],int start,int end)
	{
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int t=arr[j];
				arr[j]=arr[i];
				arr[i]=t;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return (i+1);
	}
				
		
	void quicksort(int arr[],int start,int end)
	{
		if(start<end)
		{
			int pi=partition(arr,start,end);
		
			quicksort(arr,start,pi-1);
			quicksort(arr,pi+1,end);
		}
	}
	public static void main(String[] args)
	{
		sixtyFiveA obj=new sixtyFiveA();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.quicksort(arr,0,size-1);
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		int count=1,id=0;
		for(int i=id+1;i<size;i++)
		{
			if(arr[id]==arr[i])
			{
				count++;
			}
			else
			{
				System.out.println(arr[id]+"frequency is "+count);
				count=1;
				id=i;
			}	
			if(i==size-1)
			{
				System.out.println(arr[id]+"frequency is "+count);
			}
		}
		
	}
}
		