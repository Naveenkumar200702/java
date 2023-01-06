import java.util.*;
public class fiftyOne{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int Result=0;
		while(num!=0)
		{
			Result=Result*10+num%10;
			num=num/10;
		}
		System.out.println("output "+ Result);	
	}
}