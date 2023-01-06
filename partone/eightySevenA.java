import java.util.*;
public class eightySevenA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of char array");
		int n=sc.nextInt();
		char[] ch=new char[n];
		for(int i=0;i<n;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		String s="";
		
		for(char i:ch)
		{
			s+=i;
		}
		System.out.println("the string is "+s);
		String ss=new String(ch);
		System.out.println(ss);
	}
}
			