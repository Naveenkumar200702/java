import java.util.*;
public class twentySeven{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number1");
		int Number1=sc.nextInt();
		System.out.println("enter the Number2");
		int Number2=sc.nextInt();
		System.out.println("Before Swaping");
		System.out.println("Number1="+Number1);
		System.out.println("Number2="+Number2);
		Number1+=Number2;
		Number2=Number1-Number2;
		Number1-=Number2;
		System.out.println("After Swaping");
		System.out.println("Number1="+Number1);
		System.out.println("Number2="+Number2);
		
		
	}
}