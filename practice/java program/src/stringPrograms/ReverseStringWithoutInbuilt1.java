package stringPrograms;
import java.util.*;
public class ReverseStringWithoutInbuilt1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ReverseStringWithoutInbuilt1 object=new ReverseStringWithoutInbuilt1();
		System.out.println("enter the input");
		String str=sc.nextLine();
		System.out.println(object.reverse(str));
		
	}
	String reverse(String str)
	{
		if(str.length()==0)
			return "";
		return reverse(str.substring(1))+str.charAt(0);
	}
	
}
