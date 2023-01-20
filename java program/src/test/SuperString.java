package test;
import java.util.*;
public class SuperString {
	static boolean checkValid(String x,String y)
	{
		boolean check=true;
		int count=0;
		for(int i=0;i<y.length();i++)
		{
			for(int j=0;j<x.length();j++)
			{
				if(y.charAt(i)==x.charAt(j)) count++;	
			}
		}
		return count==y.length();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		int result=0;
		System.out.println("enter the size for X string array");
		int sizex=sc.nextInt();
		String x[]=new String[sizex];
		System.out.println("Enter elements");
		for(int i=0;i<sizex;i++)
		{
			x[i]=sc.next();
		}
		System.out.println("enter the size for Y string array");
		int sizey=sc.nextInt();
		String y[]=new String[sizey];
		System.out.println("Enter elements");
		for(int j=0;j<sizey;j++)
		{
			y[j]=sc.next();
		}
		for(int i=0;i<sizex;i++){
			for(int j=0;j<sizey;j++)
			{
				flag=checkValid(x[i],y[j]);
				if(flag==false)	break;	
			}
			if(flag==true)
			{
				result++;
			}
		}
	System.out.println("output :"+result);	
	}
}
