import java.util.*;
public class sixtyOneC{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("reverse array using for loop");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}
}