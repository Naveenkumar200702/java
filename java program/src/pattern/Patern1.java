package pattern;

import java.util.Scanner;

public class Patern1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter input");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int s=0;s<n-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=-i+1;j<i;j++)
			{
				int l=j;
				if(l<0) l*=-1;
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
