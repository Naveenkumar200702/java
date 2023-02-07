package myprograms;

import java.util.*;

public class InsertionSort {
	public static void main(String[] args)
	{
		int array[]= {3,8,5,6,1,6,7};
		for(int i=1;i<array.length;i++)
		{
			int key=array[i];//5
			int j=i-1;//2
			while(j>=0&&array[j]>key)
			{
				array[j + 1] = array[j];
                j = j - 1;
			}
			array[j + 1] = key;
		}
		System.out.println(Arrays.toString(array));
	}
	
}
