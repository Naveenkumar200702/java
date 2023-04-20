import java.util.*;
public class thirtyThree{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		char c=sc.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not a Alphabet");
		}
	}
}