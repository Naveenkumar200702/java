import java.util.*;
public class thirtyOne{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=1,b=1,c=1;
		System.out.println("enter the equation");
		String equ=sc.nextLine();
		if(equ.length()>=8&&equ.length()<=10)
		{
			String equation=equ.replace("-","+");
			equation=equation.replace("=","+");
			System.out.println(equation);
			String[] coeffi=equation.split("\\+");
			for(int i=0;i<coeffi.length-1;i++)
			{
				char ch;
				String s=coeffi[i].toString();
				if((s.charAt(0)>='0')&&(s.charAt(0)<='9'))
				{
					ch=s.charAt(0);	
				}
				else
				{	
					ch='1';	
				}
				if(i==0)
				{
					a=ch-'0';
				}
				else if(i==1)
				{
					b=Integer.parseInt(String.valueOf(ch));
				}
				else
				{
					c=Character.getNumericValue(ch);
				}	
			}
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
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
		else
		{
			System.out.println("enter a valid equation");
		}
	}
}
