import java.util.*;
public class sixtyThreeB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int small=arr[0],large=arr[0];
		for(int i=0;i<size;i++)
		{
			if(small>arr[i])
				small=arr[i];
			if(large<arr[i])
				large=arr[i];
		}
		System.out.println("the smallest number is "+small);
		System.out.println("the largest number is "+large);
	}
}