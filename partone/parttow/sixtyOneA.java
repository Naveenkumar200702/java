import java.util.*;
public class sixtyOneA{
	static int reverse(int arr[],int size)
	{
		if(size>0)
		{
			size--;
			System.out.println(arr[size]);
			return reverse(arr,size);
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("array in reverse order using recursion");
		reverse(array,size);
	}
}