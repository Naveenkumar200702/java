import java.util.*;
public class seventeen{
	static float pi=3.14f;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle1");
		int Radius1=sc.nextInt();
		System.out.println("Enter the radius of circle2");
		int Radius2=sc.nextInt();
		float Area1=pi*(Radius1*Radius1);
		float Area2=pi*(Radius2*Radius2);
		System.out.println(Area1-Area2);
	}
}