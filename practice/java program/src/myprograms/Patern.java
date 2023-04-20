package myprograms;
import java.util.*;
public class Patern {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		int n=sc.nextInt();
		int value=1;
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<n-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(value++ +" ");
			}
			System.out.println();
		}
	}
}
