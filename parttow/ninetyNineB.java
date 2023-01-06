import java.util.*;
public class ninetyNineB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sc.nextLine();
		int x=' ';
		Queue<Character> que=new LinkedList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				int n=(int)c-x;
				
				c=(char)n;
				que.add(c);
			}
			else
			{
				que.add(c);
			}
		}	
		while(!que.isEmpty())
		{
			System.out.print(que.remove());
		}
		
	}
}