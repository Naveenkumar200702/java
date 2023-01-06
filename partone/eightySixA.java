import java.util.*;
public class eightySixA{
	
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the length of char array");
			int n=sc.nextInt();
			char[] ch=new char[n];
			for(int i=0;i<n;i++)
			{
				ch[i]=sc.next().charAt(0);
			}
			System.out.println("output");
			for(char c:ch)
				System.out.print(c);
	
	}
}