import java.util.*;
public class one{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a input");
		int n=sc.nextInt();
		int count=0;
		System.out.println("multiplication table");
		for(int i=1;i<=20;i++)
		{
			if(i<=10)
			{
				System.out.println(i+" * "+n+" = "+i*n);
			}		
		}
		System.out.println("Subtraction Table");
		for(int j=1;j<=200;j++)
		{
			if(j-n>=0)
			{
				count++;
				int a=j-n;
				System.out.println(j+" - "+n+" = "+ a);
			}
			if(count==10)
			{
				break;
			}
		}
			
	}
}