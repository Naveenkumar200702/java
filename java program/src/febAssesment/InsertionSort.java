package febAssesment;
import java.util.*;
public class InsertionSort {
	public static void main(String[] args)
	{
		int array[]= {1,5,3,2,6,9};
		for(int i=1;i<array.length;i++)
		{
			int key=array[i];
			int j=i-1;
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
