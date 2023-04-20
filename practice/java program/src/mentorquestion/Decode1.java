package mentorquestion;

public class Decode1 {
	public static void main(String[] args)
	{
		String str="IIII";
		//String str="IIDDIDID"; 
		int[] arr=new int[str.length()+1];
		int start=1;
		for(int i=0;i<=str.length();i++)
		{	
			if(str.length()==i||str.charAt(i)=='I')
			{
				arr[i]=start++;
				int j=i-1;
				while(j>=0&&str.charAt(j)!='I')
				{
					arr[j]=start++;
					j--;
				}
			}
		}
		for(int i=0;i<=str.length();i++)
		{
			System.out.print(arr[i]);
		}
	}
}
