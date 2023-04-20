package febAssesment1;
import java.util.*;
public class PaternPrinting1 {
	int minimum(int row,int col,int row1,int col1)
	{
		int min=0;
		min=Math.min(row,col);
		min=Math.min(row1, min);
		min=Math.min(col1,min);
		return min;
	}
	public static void main(String[] args)
	{
		PaternPrinting1 object=new PaternPrinting1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int input=sc.nextInt();
		for(int i=0;i<input;i++)
		{
			for(int j=0;j<input;j++)
			{
				int element=object.minimum(i,j,input-1-i,input-1-j);
				if(element%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
	}
}
