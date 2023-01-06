import java.util.*;
public class twentyOne{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int y=sc.nextInt();
		int z=(++y*(y++ +5));
		System.out.println(z);
	}
}