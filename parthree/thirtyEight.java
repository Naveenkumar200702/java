import java.util.*;
public class thirtyEight{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int id=0,temp;
		for(int i=1;i<n;i++)
		{
			if(arr[id]<arr[i])
			{
				temp=arr[i];
				arr[i]=arr[id];
				arr[id]=temp;
			}
		}
		System.out.println("Largest Number = "+arr[id]);
		
		
	}
}