import java.util.*;
public class eightyThreeA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("enter the number of columns");
		int column=sc.nextInt();
		System.out.println("enter the elements");
		int arr[][]=new int[rows][column];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column-i;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}