package mentorquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<List<Integer>> outerList=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			List<Integer> innerList=new ArrayList<>();
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i)
					innerList.add(1);
				else
				{
					innerList.add(outerList.get(i).get(j-1) + outerList.get(i).get(j));
				}
			}
			outerList.add(innerList);
		}
		System.out.println(outerList);
	}

}
