package stringPrograms;
import java.util.*;
public class ArraylistIteration {
	public static void main(String... argument)
	{
		ArrayList<Integer> list=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println("iterate using advance forloop");
		for(int iterate:list)
		{
			System.out.println("values "+iterate);
		}
		System.out.println("iterate using Iterator");
		Iterator iterate=list.iterator();
		while(iterate.hasNext())
		{
			System.out.println("values "+iterate.next());
		}
		System.out.println("Iterate using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("values "+list.get(i));
		}
	}
}
