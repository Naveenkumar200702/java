package learningRecursion;

import java.util.Arrays;

public class ReverseArrayRecursion {
	static void reverse(int[] array,int start)
	{
		if(start>=array.length/2)
			return;
		int temp=array[start];
		array[start]=array[array.length-1-start];
		array[array.length-1-start]=temp;
		reverse(array,start+1);
	}
	public static void main(String[] args)
	{
		int array[]= {1,2,3,4,5,6,7};
		reverse(array,0);
		System.out.println(Arrays.toString(array));
	}
}
