import java.util.*;
public class six
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting roll no");
		int start=sc.nextInt();
		System.out.println("enter the ending roll no");
		int end=sc.nextInt();
		int totalStudent=end-start+1;
		System.out.println("enter no of groups");
		int groupNum=sc.nextInt();
		for(int i=0;i<groupNum;i++)
		{
			System.out.println("Group "+i+1);
			for(int j=start+i;j<=end;j=j+groupNum)
			{
				System.out.println(j);
			}
		}
		
		
	}
}
		