import java.util.*;
public class sixtySixA{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Queue<Integer> que=new LinkedList<Integer>();
		for(int i=0;i<size;i++)
		{
			que.add(arr[i]);
		}
		System.out.println("enter the elements for left rotate");
		int rotate=sc.nextInt();
		for(int i=0;i<rotate;i++)
		{
			int temp=que.remove();
			que.add(temp);
		}
		while(!que.isEmpty())
		{
			System.out.println(que.remove());
		}
	}
}
		