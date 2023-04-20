import java.util.*;
public class fortyThree{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter number to rotate left");
		int n=sc.nextInt();
		Queue<Integer> que=new LinkedList<Integer>();
		for(int i=0;i<size;i++)
		{
			que.add(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			int temp=que.remove();
			que.add(temp);
		}
		System.out.println("array after rotating left ");
		while(!que.isEmpty())
		{
			System.out.println(que.remove());
		}
	}
}
		
			