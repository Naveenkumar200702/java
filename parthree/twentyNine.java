import java.util.*;
public class twentyNine{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		char s=sc.next().charAt(0);
		if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
		{
			System.out.println("Vovel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}