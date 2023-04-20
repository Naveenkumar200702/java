import java.util.*;
public class eightyFiveA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		System.out.println("enter the number of columns");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("["+i+","+j+"] -");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		int sumrow=0,sumcolumn=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sumrow+=arr[i][j];
				sumcolumn+=arr[j][i];
			}
			System.out.println("sum of row "+(i +1)+" - "  + sumrow);
			System.out.println("sum of column "+(i +1) + " - " + sumcolumn);
			sumrow=0;
			sumcolumn=0;
		}	
		
	}
}
			