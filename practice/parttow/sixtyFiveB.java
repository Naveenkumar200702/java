import java.util.*;
public class sixtyFiveB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=1;
		for(int i=0;i<size;i++)
		{
			if(arr[i]!=0)
			{
				for(int j=i+1;j<size;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=0;
					}
				}
				System.out.println(arr[i]+"frequency "+count);
				count=1;
			}
		}
					
		
	}
}