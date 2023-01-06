import java.util.*;
public class eightySixB{
	
	static int printt(char[] ch,int start)
	{
		System.out.println("output");
		if(start<ch.length)
		{
			System.out.println(ch[start]);
			return printt(ch,start+1);	
		}	
		return 0;
	}
	public static void main(String[] agrs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		char ch[]=new char[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		printt(ch,0);
	}
}
		