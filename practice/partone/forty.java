import java.util.*;
public class Forty{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0,id=0,a=0;
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i:arr)
		{
			count++;
		}
		System.out.println("length ="+count);	
		System.out.println("length using length() ="+arr.length);
		
	}
}