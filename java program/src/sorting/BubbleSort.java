package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args)
	{
		int array[]= {9,3,6,2,7,10,80};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
