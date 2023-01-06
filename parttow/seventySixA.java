import java.util.*;
public class seventySixA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter column size");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int transpose[][]=new int[column][row];
		int x=0,y=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				transpose[j][i]=arr[i][j];
				
			}
		}
		System.out.println("Original matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose matrix");
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
}
				