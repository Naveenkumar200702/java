import java.util.*;
public class fortyeight{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int s=1;s<n-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=-i;j<=i;j++)
			{
				if(j<=0)
				{
					System.out.print(n-(-j)+" ");
				}
				else
				{
					System.out.print(n-j+" ");
				}
				
			}
			System.out.println();
		}
		
	}
}