import java.util.*;
public class fiftyeight{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a input");
		int n=sc.nextInt();
		int l,m;
		for(int i=-n+1;i<n;i++)
		{
			if(i<0)
				m=-i;
			else
				m=i;
			for(int j=-n;j<=n;j++)
			{
				if(j==0)
					continue;
				if(j<0)
				{
					l=-j;
				}
				else
				{
					l=j;
				}
				if(l<=n-m-1)
				{
					System.out.print("_");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
		