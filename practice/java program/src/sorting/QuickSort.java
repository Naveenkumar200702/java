package sorting;
import java.util.Arrays;
public class QuickSort {
	int seperate(int[] array,int low,int high)
	{
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(array[j]<array[high])
			{
				i++;
				swap(array,i,j);
			}
		}
		swap(array,i+1,high);
		return i;
	}
	void swap(int[] array,int i,int j)
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	void quickSort(int[] array,int low, int high)
	{
		if(low<high)
		{
			int pi=seperate(array,low,high);	
			quickSort(array,low,pi-1);
			quickSort(array,pi+1,high);
		}
		
	}
	public static void main(String[] args)
	{
		int[] array= {5,3,7,1,8,6,2,9,30,20,10};
		new QuickSort().quickSort(array, 0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
