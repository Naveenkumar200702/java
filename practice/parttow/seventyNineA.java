import java.util.*;
public class seventyNineA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the column");
		int column=sc.nextInt();
		boolean check=true;
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
				if(i==j)
				{
					if(arr[i][j]!=1)
					{
						check=false;
						break;
					}
				}
				else
				{
					if(arr[i][j]!=0)
					{
						check=false;
						break;
					}
				}
			}
			if(check==false)
			{
				System.out.println("not a identity matrix");
				break;
			}
		}
		if(check==true)
		{
			System.out.println("Identity matrix");
		}
	}		
}	