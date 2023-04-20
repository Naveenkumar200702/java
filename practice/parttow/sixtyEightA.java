import java.util.*;
public class sixtyEightA{
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
		int sum=0;
		for(int i:arr)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}