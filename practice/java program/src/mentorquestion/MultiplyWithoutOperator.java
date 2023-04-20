package mentorquestion;

import java.util.Scanner;

public class MultiplyWithoutOperator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number to multiply by 15-->"); 
		int n=sc.nextInt();
		int multi=15;
		int method1=0;
		for(int i=0;i<multi;i++)
		{
			method1+=n;
		}
		System.out.println("method 1 -->"+ method1);
		int method2=(n<<4)-n;
		System.out.println("method2-->"+method2);
		
	//multiply with 7.5
		float multi1=7.5f;
		System.out.print("Enter even integer to multiply with 7.5-->");
		n=sc.nextInt();
		int method3=(n<<3)-(n>>1);
		System.out.println("Mutilplay by 7.5--> "+method3);
	//15*n/16
		
		System.out.print("Enter n value for the equation 15*n/16 --> ");
		n=sc.nextInt();
		float method4 = ((n<<4)-n)>>4;
		System.out.println("15*n/16 --> "+method4);
	}
}
