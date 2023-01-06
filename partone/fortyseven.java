import java.util.*;
public class fortyseven{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
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
					System.out.print(++x+" ");
					
				}
				else
				{
				
					System.out.print(--x+" ");
					
				}
				
			}
			x=0;
			System.out.println();
		}
		
	}
}