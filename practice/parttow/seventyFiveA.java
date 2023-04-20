import java.util.*;
public class seventyFiveA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Queue<Integer> even=new LinkedList<>();
		Queue<Integer> odd=new LinkedList<>();
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			else
			{
				odd.add(arr[i]);
			}		
		}
		System.out.println("even numbers "+even);
		System.out.println("odd numbers "+odd);
	}
}