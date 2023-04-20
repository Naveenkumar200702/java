package mentorquestion;

public class LongestCommonWords {
	public static void main(String[] args)
	{
		String[] str={"technique", "technician", "technology", "technical"};
		int len=Integer.MAX_VALUE;
		for(String s: str)
		{
			len=Math.min(len, s.length());
		}
		int count=0;
		for(int i=0;i<len;i++)
		{
			char c=str[0].charAt(i);
			for(int j=1;j<str.length;j++)
			{
				if(c!=str[j].charAt(i))
				{
					count=i+1;
					System.out.println("subString is "+str[0].substring(0,i));
					System.exit(0);
				}
			}
		}
	}

}
