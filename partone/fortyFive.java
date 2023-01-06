import java.util.*;
public class fortyFive{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0,id=0,a=0;
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int Result=0;
		for(int i:arr)
		{
			Result+=i;
		}
		System.out.println("The sum of elememnts in a array is "+Result);
		
	}
}