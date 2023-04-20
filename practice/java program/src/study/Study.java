package study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Study {
	public static void main(String[] args)
	{
		int i=4;
		int[][] n=new int[5][5];
		int len=5;
		for(i=1;i<=25;i++)
		{
			int row=(len-1)-(i-1)/len;
			int col=row%2==0?(i-1)%len:(len-1)-((i-1)%len);
			System.out.println(row +" "+col);
			n[row][col]=i;
			
		}
		System.out.println("assending col "+(i-1)%5);
		 Queue<int[]> que=new LinkedList<>();
         que.add(new int[]{0,0});
         que.isEmpty();
		
		System.out.println((i-1)/5);
		System.out.println(Arrays.deepToString(n));
	}

}
//int row=(i-1)/5;
//int col=(i-1)%5;
