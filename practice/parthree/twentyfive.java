import java.util.*;
public class twentyfive{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the divident");
		int Divident=sc.nextInt();
		System.out.println("enter the Divisor");
		int Divisor=sc.nextInt();
		int Quotient=Divident/Divisor;
		System.out.println("Quotient="+Quotient);
		int Remainder=Divident%Divisor;
		System.out.println("Remainder="+Remainder);
		
		
	}
}