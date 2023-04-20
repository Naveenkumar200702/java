import java.util.*;
public class ninetySixB{
	static int find(String ss,char ch,int id)
	{
		if(id==ss.length()-1)
		{
			System.out.println("match not found");
			return 1;
		}
		else if(ss.charAt(id)==ch)
		{
			System.out.println("match found");
			return 1;
		}
		else
		{
			id++;
			return find(ss,ch,id);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		System.out.println("enter Target");
		char c=sc.next().charAt(0);
		find(s,c,0);
	}
}