import java.util.*;
public class thirtySix{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements on the even Position");
		for(int i=0;i<n;i+=2)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}