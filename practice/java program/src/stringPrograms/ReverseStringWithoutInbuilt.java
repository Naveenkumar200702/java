package stringPrograms;
import java.util.*;
public class ReverseStringWithoutInbuilt {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the input");
		String str=sc.nextLine();
		int j=str.length()-1;
		String result="";
		while(j>=0)
		{
			result+=str.charAt(j);
			j--;
		}
		System.out.println("result");
		System.out.println(result);
		sc.close();
	}
}
