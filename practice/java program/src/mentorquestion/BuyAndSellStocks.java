package mentorquestion;

public class BuyAndSellStocks {
	public static void main(String[] args)
	{
		int minPrize=Integer.MAX_VALUE;
		int maxPrize=0;
		//int[] arr= {7,1,5,3,6,4};
		int[] arr= {7,6,4,3,1};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minPrize)
			{
				minPrize=arr[i];
			}
			else if(arr[i]-minPrize>maxPrize)
			{
				maxPrize=arr[i]-minPrize;
			}
		}
		System.out.println(maxPrize);
	}
}
