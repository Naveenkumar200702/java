import java.util.*;
public class four{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		System.out.printf("Binary AND  is %d",n1&n2);
		System.out.println();
		System.out.println("binary OR is "+((int)n1|(int)n2));
		
		System.out.println("binary XOR is "+(n1^n2));
		
		System.out.println("Complement operator "+(~n1));
		
		System.out.println("right shift operator "+(n1>>2));
		
		
		System.out.println("left shift operator "+(n1<<2));
		
	}
}