import java.util.*;
public class seven
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j||j==n-i-1)
				{
					System.out.print(s.charAt(j)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}