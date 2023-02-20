package myprograms;
import java.util.*;
public class PaternPrinting {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		int n=sc.nextInt();
		int array[][]=new int[n][n];
		int value=1;
		int size=n-1;
		int i=0,j=0,k=0,l=0,m=0;
		while(i<n)
		{
			if(j<n-i)
			{
				array[k][j]=value;
				System.out.print(j);
				j++;	
			}
			else if(k!=j)
			{
				array[j][k]=value;
				System.out.print(k);
				k++;
				l=k;
				
			}
			else if(l>i)
			{
				array[i][l]=value;
				System.out.print(l);
				l--;
			}
			else if(m>i)
			{
				array[l][m]=value;
				System.out.print(m);
				m--;
			}
			else
			{
				i++;
				j=i;
				k=n-i;
				l=n-i;
				m=n-i;
				
			}	
			System.out.print(" ");
		}
		System.out.println();
		for(int x=0;x<n;x++)
		{
			for(int y=0;y<n;y++)
			{
				System.out.print(array[x][y]+" ");
			}
			System.out.println();
		}
		
	}
}
