import java.util.*;
public class sixtyOneB{
	public static void main(String[] args)
	{
		Stack<Integer> sta=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("array in reverse order using stack");
		for(int i=0;i<size;i++)
		{
			sta.push(array[i]);
		}
		while(!sta.empty())
		{
			System.out.println(sta.pop());
		}
		
	}
}