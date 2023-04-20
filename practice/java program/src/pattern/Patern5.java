package pattern;

import java.util.Scanner;

public class Patern5 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter drawing board height");
		int dHeight=20;
		int dWidth=20;
		int diaH=10;
		int diaW=10;
		int size=7;
		int print=0;
		for(int i=0;i<dHeight;i++)
		{
			int l=i;
			if(l<0)l*=-1;
			for(int j=0;j<dHeight;j++)
			{
				if(i==0||i==dHeight-1||j==0||j==dWidth-1)
					System.out.print("*");
				else if(diaH-size==i&&j==diaH)
					System.out.print("^");
				else if(diaH+size==i&&j==diaH)
					System.out.print("v");
				
				else if(diaH+size==j&&i==diaW)
					System.out.print("a");
				
				else if(diaH-size==j&&i==diaW)
					System.out.print("a");
				else
					
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
