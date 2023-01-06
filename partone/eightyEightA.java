import java.util.*;
public class eightyEightA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String[] str=s.split(" ");
		for(String i:str)
		{
			System.out.println(i);
		}
	}
}