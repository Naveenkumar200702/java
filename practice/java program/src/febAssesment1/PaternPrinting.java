package febAssesment1;
import java.util.*;
public class PaternPrinting {
	void patern(int[][] array,int row,int col,int i,int j,int val,int element)
	{
		if(row==i&&col==j)
		{
			array[i][j]=element;
			return;
		}
		array[i][j]=element;
		patern(array,row,col,j,val-i, val,element);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		PaternPrinting object=new PaternPrinting();
		System.out.println("Enter the value");
		int value=sc.nextInt();
		int array[][]=new int[value][value];
		int element=1;
		for(int i=0;i<value-2;i++)
		{
			for(int j=i;j<value-i;j++)
			{
				object.patern(array, i, j,j ,value-1-i, value-1,element);
			}
			if(element==1)
			{
				element=0;
			}
			else {
				element=1;
			}
		}		
		for(int i=0;i<value;i++)
		{
			for(int j=0;j<value;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
