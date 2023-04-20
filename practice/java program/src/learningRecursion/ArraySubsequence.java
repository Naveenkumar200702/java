package learningRecursion;
import java.util.*;
public class ArraySubsequence {
	void subSequence(int i,int length,int[] array,ArrayList<Integer> list)
	{
		if(i==length)
		{
			System.out.println(list);
			return;
		}
		list.add(array[i]);
		subSequence(i+1,length,array,list);
		list.remove(Integer.valueOf(array[i]));
		subSequence(i+1,length,array,list);	
	}
	public static void main(String[] args)
	{
		ArraySubsequence object=new ArraySubsequence();
		int[] array= {1,3,4};
		object.subSequence(0,array.length,array,new ArrayList<Integer>());
	}
}