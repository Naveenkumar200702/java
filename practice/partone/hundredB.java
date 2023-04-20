import java.util.*;
public class hundredB{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Ascii Value");
		int ascii=sc.nextInt();
		char[] cc=Character.toChars(ascii);
		char c=cc[0];
		if(c>='A'&&c<='Z')
		{
			System.out.println(c);
		}
		else
		{
			System.out.println("enter a valid Input");
		}
	}
}
		