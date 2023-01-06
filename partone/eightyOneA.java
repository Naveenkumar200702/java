import java.util.*;
public class eightyOneA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the column");
		int column=sc.nextInt();
		int check=1;
		int arr[][]=new int[rows][column];
		int arr1[][]=new int[rows][column];
		for(int k=0;k<2;k++)
		{
			System.out.println("enter the elements for matrix "+(k+1));
			
			for(int i=0;i<rows;i++)
			{                                                     
				for(int j=0;j<column;j++)
				{
					if(k==0)
					{
						System.out.print(i+" row "+j+" column = ");
						arr[i][j]=sc.nextInt();
					}
					else
					{
						System.out.print(i+" row "+j+" column = ");
						arr1[i][j]=sc.nextInt();
					}
				}
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(arr[i][j]!=arr1[i][j])
				{
					check=0;
					break;
				}
			}
			if(check==0)
			{
				System.out.println("two matrix are not same");
				break;
			}
		}
		if(check==1)
		{
			System.out.println("Two matric are same");
		}
	}
	
}