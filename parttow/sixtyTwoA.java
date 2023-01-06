import java.util.*;
public class sixtyTwoA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("even position");
		for(int i=0;i<size;i+=2)
		{
			System.out.println(array[i]);
		}
		System.out.println("odd position");
		for(int i=1;i<size;i+=2)
		{
			System.out.println(array[i]);
		}
	}
}