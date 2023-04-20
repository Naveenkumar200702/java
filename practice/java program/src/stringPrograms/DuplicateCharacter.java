package stringPrograms;
import java.util.*;
public class DuplicateCharacter {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String string=sc.nextLine();
		Set<String> set=new HashSet();
		for(int i=0;i<string.length();i++)
		{
			String check=""+string.charAt(i);
			if(string.substring(i+1).contains(check))
			{
				set.add(check);
			}
		}
		System.out.println(set);
	}
}
