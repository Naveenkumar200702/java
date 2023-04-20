import java.util.*;
public class sixtyThreeA{
	
	int partition(int[] arr,int start,int end)
	{
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int tem=arr[j];
				arr[j]=arr[i];
				arr[i]=tem;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return (i+1);
	}
	void quicksort(int[] arr,int start, int end)
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
		Scanner sc=new Scanner(System.in);
		sixtyThreeA obj=new sixtyThreeA();
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.quicksort(arr,0,size-1);
		System.out.println("Smallest element "+arr[0]);
		System.out.println("largest element " +arr[arr.length-1]);
	}
}