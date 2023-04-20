package stringPrograms;
import java.util.*;
public class IterateHashMap {
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=1;i<=10;i++)
		{
			map.put(i,i);
		}
		System.out.println("hash map using advanced for loop");
		for(int i:map.keySet())
		{
			System.out.println(i+" "+map.get(i));
		}
		System.out.println("hash map using iterator using key");
		Iterator it=map.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println("key is "+it.next()+ " value is "+map.get(it.next()));
		}
		System.out.println("hash map iterator only on values");
		Iterator<Integer> iterator=map.values().iterator();
		while(iterator.hasNext())
		{
			System.out.println(" values "+ iterator.next());
		}
	}
}
