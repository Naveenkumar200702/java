import java.util.*;
public class seventyFourA{
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
		int arr1[][]=getelement(row1,column1);
		int result[][]=new int[row][column1];
		int check=1;
		for(int i=0;i<row;i++)
		{
			if(row!=column1)
			{
				System.out.println("enter a valid matrix");
				check=-1;
				break;
			}	
			
			for(int j=0;j<column1;j++)
			{
				result[i][j]=0;
				for(int k=0;k<row1;k++)
				{
					result[i][j]+=arr[i][k]*arr1[k][j];
				}
			}
			
		}
		for(int i=0;i<row;i++)
		{
			if(check==-1)
			{
				break;
			}
			for(int j=0;j<column1;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
			
		
	}
}
		