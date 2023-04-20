import java.util.*;
public class sixtySevenA{
	public static void main(String[] args)
	{
		Set<Integer> st=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("duplicate elements");
		for(int i=0;i<size;i++)
		{
			if(!st.add(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
	}
}
				