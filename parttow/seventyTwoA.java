import java.util.*;
public class seventyTwoA{
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
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<size;i++)
		{
			map.put(arr[i],arr[i]);
		}
		System.out.println("array without repeation");'
		for(int i:map.values())
		{
			System.out.println(i);
		}
	}
}
		