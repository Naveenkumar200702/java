import java.util.*;
public class fortySix{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the number to right rotate");
		int n=sc.nextInt();
		int id=size-n;
		while(id<size)
		{
			System.out.println(arr[id]);
			id++;
		}
		for(int i=0;i<size-n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
		