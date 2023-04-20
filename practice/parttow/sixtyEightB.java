import java.util.*;
public class sixtyEightB{
	int sum=0;
	int add(int arr[],int n)
	{
		if(n<arr.length)
		{
			sum= sum+arr[n];
			return add(arr,n+1);
		}
		else
		{
			return sum;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		sixtyEightB obj=new sixtyEightB();
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(obj.add(arr,0));
	}
}