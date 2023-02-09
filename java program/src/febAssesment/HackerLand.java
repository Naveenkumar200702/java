package febAssesment;
import java.util.Arrays;
public class HackerLand {
	int[] sorting(int[] spent,int start,int end)
	{	
		int array[]=new int[end-start];
		int index=0;
		for(int i=start;i<end;i++)
		{
			array[index++]=spent[i];
		}
		Arrays.sort(array);
		return array;
	}
	public static void main(String[] args)
	{	
		HackerLand object=new HackerLand();
//		int[] spent= {2,3,4,2,3,6,8,4,5};	
//		int n=5;
		int[] spent= {1,2,3,4,4};
		int n=4;
		int i=0,j=n;
		int count=0;
		int median=0;
		while(j<=spent.length)
		{
			int[] array=object.sorting(spent,i,j);
			if(n%2==0)
			{
				int median1=array[array.length/2]+array[(array.length/2)+1];
				median=median1/2;
			}
			else
			{
				median=array[array.length/2];
			}
			if(j<spent.length-1)
			{
				if((2*median>=spent[j+1]))
				{
					count++;
				}
			}
			i++;
			j++;
		}
		System.out.println("The notification Count is "+count);
	}	
}	