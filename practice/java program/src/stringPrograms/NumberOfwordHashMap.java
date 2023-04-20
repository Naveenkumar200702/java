package stringPrograms;
import java.util.*;
public class NumberOfwordHashMap {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String string=sc.nextLine();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int j=0;
		for(int i=0;i<=string.length();i++)
		{
			if(i==string.length()||string.charAt(i)==' ')
			{
				map.put(string.substring(j,i),0);
				j=i+1;
			}
		}
		j=0;
		for(int i=0;i<=string.length();i++)
		{
			if(i==string.length()||string.charAt(i)==' ')
			{
				map.put(string.substring(j,i),map.get(string.substring(j,i))+1 );
				j=i+1;
			}
		}
		System.out.println(map);
		
	}
}
