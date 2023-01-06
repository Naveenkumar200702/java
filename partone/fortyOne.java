import java.util.*;
public class fortyOne{
	void Print(int[] ar,String s)
	{
		System.out.println(s);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		fortyOne obj=new fortyOne();
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0,id=0,a=0;
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		obj.Print(arr1,"Copied array using for loop");
		
		int arr2[]=new int[arr.length];
		arr2=arr;//it points the same location so changes in one array affect the another also..
		obj.Print(arr2,"copied array using location");
		
		int arr3[]=new int [arr.length];
		arr3=arr.clone();
		obj.Print(arr3,"copied array using Clone()");
		
		int arr4[]=new int[arr.length];
		System.arraycopy(arr,0,arr4,0,arr.length);//original array,starting index of orginal array,destination array,starting index of destination array,destination array length.
		obj.Print(arr4,"copied array using arraycopy");
		
		int arr5[]=Arrays.copyOf(arr,arr.length);
		obj.Print(arr5,"copied array using copyOf");
		
		int arr6[]=Arrays.copyOfRange(arr,1,arr.length);
		obj.Print(arr6,"copied array using copyOfRange");	
	}
}