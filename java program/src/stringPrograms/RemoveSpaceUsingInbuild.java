package stringPrograms;
import java.util.*;
public class RemoveSpaceUsingInbuild {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String string=sc.nextLine();
		String string1=string.replaceAll("\\s","");
		System.out.println(string1);
	}
}
