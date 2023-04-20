import java.util.*;
public class three{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int num=sc.nextInt();
		int i=num,n=0,res;
		while(i!=0)
		{
			n=n*10+i%10;
			i=i/10;
		}
		res=num-n;
		System.out.println(res);
	}
}