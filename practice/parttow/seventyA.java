import java.util.*;
public class seventyA{
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
		for(int i=0;i<size;i++)//bubblesort
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int y=size-1;
		while(y>0)
		{
			if(arr[y-1]<arr[y])
			{
				System.out.println("second largest nummber "+arr[y-1]);
				break;
			}
			else
			{
				y--;
			}
		}
		
	}
}