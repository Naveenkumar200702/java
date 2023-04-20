import java.util.*;
public class sixty{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int no=sc.nextInt();
		int singleTerm=1,result=1,ans=1;
		for(int i=0;i<no-1;i++)
		{	
			result=result*10;
			ans=result+ans;
			singleTerm=ans+singleTerm;
		}
		System.out.println(singleTerm);
	}
}