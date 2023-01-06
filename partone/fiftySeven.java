import java.util.*;
public class fiftySeven{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String s=sc.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i==j||j==len-1-i)
				{
					System.out.print(s.charAt(i)+" ");
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