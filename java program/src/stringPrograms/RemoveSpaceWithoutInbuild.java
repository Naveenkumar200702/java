package stringPrograms;

import java.util.Scanner;

public class RemoveSpaceWithoutInbuild {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String string=sc.nextLine();
		String string1="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				string1+=string.charAt(i);
			}
		}
		System.out.println(string1);
	}
}
