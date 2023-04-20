package test;
import java.util.*;
public class SplitArray {
	static int Split(int[] array)
	{
		int left=0,right=array.length;;
		int sum1=0,sum2=0;
		int mid=left+right/2;
		while(left<mid||mid<right)
		{
			if(mid==right||mid==left)
			{
				break;
			}
			for(int i=0;i<mid;i++)
			{
				sum1+=array[i];
			}
			for(int j=mid;j<right;j++)
			{
				sum2+=array[j];
			}
			if(sum1==sum2)
			{
				return mid;
			}
			else if(sum1<sum2)
			{
				mid++;
			}
			else {
				mid--;
			}
			sum2=0;
			sum1=0;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int array[]= {1,2,1,1,1};
		System.out.println("Given array "+ Arrays.toString(array));
		int num=Split(array);
		System.out.println("Given array "+ Arrays.toString(array));
		if(num==-1)
		{
			System.out.println(num);
			return;
		}
		int arrayLeft[]=new int[num];
		int arrayRight[]=new int[array.length-num];
		int position=0;
		for(int i=0;i<num;i++)
		{
			arrayLeft[i]=array[i];
		}
		for(int j=num;j<array.length;j++)
		{
			arrayRight[position++]=array[j];
		}
		System.out.println("Array 1" +Arrays.toString(arrayLeft));
		System.out.println("Array 2"+ Arrays.toString(arrayRight));
	}
}
