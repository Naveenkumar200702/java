import java.util.*;
public class sixteen{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the value of C");
		int c=sc.nextInt();
		double d=b*b-4*a*c;
		if(d>0.0)
		{
			double r1=(-b+Math.pow(d,0.5))/(2.0*a);
			double r2=(-b-Math.pow(d,0.5))/(2.0*a);
			System.out.println("the roots are " +r1 + "and" +r2);
		}
		else if(d==0.0)
		{
			double r1=-b/(2.0*a);
			System.out.println("the root is "+r1);
		}
		else
		{
			System.out.println("roots are not real");
		}
	}
}