import java.util.*;
public class seventyThreeA{
	
	static int[][] getelement(int row,int column)
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size");
		int row=sc.nextInt();
		System.out.println("enter the column size");
		int column=sc.nextInt();
		int arr[][]=getelement(row,column);
		
		System.out.println("enter the row for second matrix");
		int row1=sc.nextInt();
		System.out.println("enter the column for second matrix");
		int column1=sc.nextInt();
		int arr1[][]=getelement(row,column);
		for(int i=0;i<row;i++)
		{
			if(row!=row1||column!=column1)
			{
				System.out.println("invalid matrix");
				break;
			}
			int result[][]=new int[row][column];
			for(int j=0;j<column;j++)
			{
				result[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}	
	}
}