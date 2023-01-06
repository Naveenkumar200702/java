import java.util.*;
public class ninetyEightA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c>='a'&&c<='z')
		{
			HashMap<Integer, Character> map=new HashMap<Integer, Character>();
			for(int i=0,j='A';i<26&&j<='Z';i++,j++)
			{
				map.put(i,(char)j);
			}
			int n=(int)c-(int)'a';
			System.out.println(map.get(n));
		}
		else
		{
			System.out.println("enter a valid input");
		}
	}
}