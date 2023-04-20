package mentorquestion;

public class FindDuplicate {
	public static void main(String[] args)
	{
		int[] array= {1,2,3,4,5,5,6};
		int ans=0;
		int len=array.length-1;
		int sum=len*(len+1)/2;
		for(int i=0;i<array.length;i++)
		{
			ans+=array[i];	
		}
		int value=array.length;
		value=value*(value+1)/2;
		if(ans!=value)
			System.out.println("Repeated number is "+Math.abs(sum-ans));
		else
			System.out.println("No repeated element");
	}

}
