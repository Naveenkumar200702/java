import java.util.*;
public class nine{
	Scanner sc=new Scanner(System.in);
	void print(int arr[],int n)
	{
		System.out.println("output");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	int[]  getelement(int n)
	{	
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}	
	void sort(int arr[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>=arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		print(arr,n);
	}
					
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		nine obj=new nine();
		System.out.println("enter the length of an array1");
		int a1=sc.nextInt();
		int arr1[]=obj.getelement(a1);
		System.out.println("enter the length for array2");
		int a2=sc.nextInt();
		int arr2[]=obj.getelement(a2);
		int id=0;
		int ar[]=new int[a1+a2];
		for(int i=0;i<a1;i++)
		{
			ar[i]=arr1[i];
			id++;
		}
		for(int j=0;j<a2;j++)
		{
			ar[id+j]=arr2[j];
		}	
		int end=ar.length-1,temp;
		for(int i=0;i<=end;i++)
		{
			for(int j=i+1;j<=end;j++)
			{
				if(ar[i]==ar[j])
				{
					temp=ar[j];
					ar[j]=ar[end];
					ar[end]=temp;
					end--;
				}
			}
		}
		
		obj.sort(ar,end+1);		
	}
}
		
		