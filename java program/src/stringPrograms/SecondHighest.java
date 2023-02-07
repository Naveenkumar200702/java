package stringPrograms;

public class SecondHighest {
	public static void main(String[] args)
	{
		int[] array= {9,5,7,8,3,4,10,20};
		int largest=0,secondLargest=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				secondLargest=largest;
				largest=array[i];	
			}
			if(array[i]>secondLargest&&array[i]<largest)
			{
				secondLargest=array[i];
			}
		}
		System.out.println("Second Largest "+secondLargest);
		System.out.println("largest"+largest);
	}
}
