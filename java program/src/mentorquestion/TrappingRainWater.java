package mentorquestion;

public class TrappingRainWater {
	public static void main(String[] args)
	{
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		int left=0,right=arr.length-1;
		int maxLeft=0,maxRight=0;
		int res=0;
		while(left<=right)
		{
			if(arr[left]<=arr[right])
			{
				if(arr[left]>=maxLeft)
				{
					maxLeft=arr[left];
				}
				else {
					res+=maxLeft-arr[left];
				}
				left++;
			}
			else {
				if(arr[right]>=maxRight)
				{
					maxRight=arr[right];
				}
				else {
					res+=maxRight-arr[right];
				}
				right--;
			}
		}
		System.out.println(res);
		
	}

}
