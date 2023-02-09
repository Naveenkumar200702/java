package febAssesment;

import java.util.*;

public class RotateMatrix {
	void rotate(int[][] array,int row,int col,int i,int j,int length,int value)
	{
		if(i==row&&j==col)
		{
			array[i][j]=value;
			return ;
		}
		rotate(array,row,col,length-j,i,length,array[i][j]);	
		array[i][j]=value;
	}
	public static void main(String[] args)
	{
		RotateMatrix object=new RotateMatrix();
		int array[][]= {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	    //int array[][]= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		//int array[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int size=array.length;
		int length=array.length-1;
		int difference =length-3;
		for(int i=0;i<size/2;i++)
		{
			for(int j=0;j<size-(size/2);j++)
			{
				object.rotate(array,i,j,length-j,i,length,array[i][j]);
			}
		}
		for(int[] j:array)
		{
			System.out.println(Arrays.toString(j));
		}
	}
}
