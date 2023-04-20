import java.util.*;
public class hundredA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		if(c>='A'&&c<='Z')
		{
			System.out.println((char)c);
		}
		else
		{
			System.out.println("enter a valid Input");
		}
	}
}
		