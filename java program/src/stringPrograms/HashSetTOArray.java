package stringPrograms;
import java.util.*;
public class HashSetTOArray {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		Integer[] array=new Integer[list.size()];
		list.toArray(array);
		System.out.println(Arrays.toString(array));
	}
}
