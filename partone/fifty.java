import java.util.*;
public class fifty{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print(x+" ");	
			}
			x--;
			System.out.println();
		}
		
	}
}