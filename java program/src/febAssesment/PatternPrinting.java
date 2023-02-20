package febAssesment;
import java.util.*;
public class PatternPrinting {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the input");
		int value=input.nextInt();
		int array[][]=new int[value][value];
		int size=value-1;
		int element=1;
		for(int i=0;i<=value/2;i++)
		{
			for(int j=i;j<value-i;j++)
			{
				array[i][j]=element;
			}
			for(int k=i;k<value-i;k++)
			{
				array[k][size-i]=element;
			}		
			for(int l=i;l<value-i;l++)
			{	
				array[size-i][l]=element;
			}
			for(int m=i;m<value-i;m++)
			{
				array[m][i]=element;
			}
			if(element==1)
			{
				element=0;
			}
			else
			{
				element=1;
			}
		}
		for(int[] i:array)
		{
			for(int j=0;j<i.length;j++)
			{
				System.out.print(i[j]+" ");
			}
			System.out.println();
		}

	}
}
