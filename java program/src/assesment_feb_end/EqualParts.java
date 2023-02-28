package assesment_feb_end;

import java.util.Arrays;

public class EqualParts {
	 static int findMid(int[] arr,int mid)
	 {
		 while(mid<arr.length&&mid>=0)
			{
			 if(mid==0||mid==arr.length)
				 break;
				int leftSum=0;
				int rightSum=0;
				for(int i=0;i<mid;i++)
				{
					leftSum+=arr[i];
				}
				for(int j=mid;j<arr.length;j++)
				{
					rightSum+=arr[j];
				}
				if(leftSum==rightSum)
				{
					break;
				}
				else if(leftSum>rightSum)
				{
					mid--;
				}
				else {
					mid++;
				}
			}
		 return mid;
	 }
	
	public static void main(String[] args)
	{
		int arr[]= {1,2,1,1,1,2,1,1};
		Arrays.sort(arr);
		int mid=arr.length/2;
		mid=findMid(arr,mid);
		if(mid==0||mid==arr.length)
		{
			System.out.println("no equal parts");
			return;
		}
		System.out.print("Left Array :");
		for(int i=0;i<mid;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.print("rightArray :");
		for(int j=mid;j<arr.length;j++)
		{
			System.out.print(arr[j]+",");
		}
	}
}
