import java.util.*;
public class thirtyNine{
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
		int id=0,end=n-1,temp;
		while(id!=end)
		{
			if(arr[id]>arr[end])
			{
				temp=arr[id];
				arr[id]=arr[end];
				arr[end]=temp;
			}
			end--;
		}
		System.out.println("smallest element = "+arr[id]);	
	}
}