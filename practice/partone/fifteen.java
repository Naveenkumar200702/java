import java.util.*;
public class fifteen{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height");
		int Height=sc.nextInt();
		System.out.println("Enter the radius");
		int Radius =sc.nextInt();
		float pi=3.14f;
		float Area=2*pi*Height*Radius+(2*pi*Radius*Radius);
		System.out.println(Area);
	}
}