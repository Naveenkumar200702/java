package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args)
	{
		int array[]= {2,3,6,1,8,5,10};
		for(int i=0;i<array.length;i++)
		{
			int index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[index])
				{
					index=j;
				}
			}
			int temp=array[index];
			array[index]=array[i];
			array[i]=temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
