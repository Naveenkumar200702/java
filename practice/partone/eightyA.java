import java.util.*;
public class eightyA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the column");
		int column=sc.nextInt();
		int numcount=0,ocount=0;
		int arr[][]=new int[rows][column];	
		for(int i=0;i<rows;i++)
		{                                                     
			for(int j=0;j<column;j++)
			{		
				System.out.print(i+" row "+j+" column = ");
				arr[i][j]=sc.nextInt();		
			}
		}
		for(int i=0;i<rows;i++)
		{                                                     
			for(int j=0;j<column;j++)
			{		
				System.out.print(arr[i][j]+" ");
						
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++)
		{                                                     
			for(int j=0;j<column;j++)
			{		
				if(arr[i][j]==0)
				{
					ocount++;
				}
				else
				{
					numcount++;
				}
			}
		}
		if(ocount>numcount)
		{
			System.out.println("sparse matrix");
		}
		else
		{
			System.out.println("not a sparse matrix");
		}
	}		
}	