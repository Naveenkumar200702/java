import java.util.*;
public class sixtyTwoB{
	static int position(int arr[],int len,int n)
	{
		if(n<len)
		{
			System.out.println(arr[n]);
			return position(arr,len,n+2);
		}
		return 1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of aray");
		int siz=sc.nextInt();
		int arr[]=new int[siz];
		System.out.println("enter the elements");
		for(int i=0;i<siz;i++)
		{
			arr[i]=sc.nextInt();
		}
		int choice=-1;
		String msg="";
		while(choice<2)
		{
			System.out.println(" 0) To print even press 0(zero) ");
			System.out.println(" 1) To print odd press 1(one) ");
			System.out.println(" 2) To exit press 2(two)");
			choice=sc.nextInt();
			if(choice==0)
			{
				msg="elements in even position";
			}
			else if(choice==1)
			{
				msg="elements in odd position";
			}
			else if(choice== 2)
			{
				System.out.println("thank you");
				break;
			}
			else
			{
				System.out.println("invalid option");
			}
			System.out.println(msg);
			position(arr,siz,choice);
		}	
	}
}
		