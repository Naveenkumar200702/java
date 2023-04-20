import java.util.*;
public class eightyFourA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array sizze");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int evencount=0,oddcount=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("evencount ="+evencount);
		System.out.println("oddcount ="+oddcount);
	}
}