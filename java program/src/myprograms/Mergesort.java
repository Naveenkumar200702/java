package myprograms;

import java.util.Arrays;

public class Mergesort {
	public static void sort(int a[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			sort(a,start,mid);
			sort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
	public static void merge(int[] a,int start,int mid,int end)
	{
		int temp[]=new int[end-start+1];
		int i=start,j=mid+1,k=0;
		while(i<=mid && j<=end)
		{
			if(a[i]<=a[j])
			{
				temp[k++]=a[i++];
			}
			else
			{
				temp[k++]=a[j++];
			}
		}
		while(i<=mid)
		{
			temp[k++]=a[i++];
		}
		while(j<=end)
		{
			temp[k++]=a[j++];
		}
		for(int m=start;m<=end;m++)
		{
			a[m]=temp[m-start];
		}
		
	}
	public static void main(String[] args)
	{
		int a[]= {1,9,34,7,23,12,78,4};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}