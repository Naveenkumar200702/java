import java.util.*;
public class ninetyThreeA{
	static char[] sort(char[] chr,int start)
	{
		if(start==chr.length-1)
		{
			return chr;
		}
		for(int i=start+1;i<chr.length;i++)
		{
			if(chr[i]>chr[start])
			{
				char temp=chr[i];
				chr[i]=chr[start];
				chr[start]=temp;
			}
		}
				
		return sort(chr,start+1);
			
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		
		sort(arr,0);
		for(char a:arr)
		{
			System.out.println(a);
		}
	
	}
}