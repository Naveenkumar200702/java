import java.util.*;
public class seventeen{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle1");
		int Radius1=sc.nextInt();
		System.out.println("Enter the radius of circle2");
		int Radius2=sc.nextInt();
		static float pi=3.14;
		float Area=pi(Radius1*Radius1-Radius2*Radius2);
		System.out.println(Area);
	}
}