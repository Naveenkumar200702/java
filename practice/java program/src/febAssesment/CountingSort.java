package febAssesment;
import java.util.*;
public class CountingSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of String");
		int n = sc.nextInt();
		int[] array = new int[n];
		String[] string = new String[n];
		int dash=n/2;
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			String s = sc.next();
			array[i]=x;
			if(dash>0)
			{
				string[i]="-";
			}
			else
			{
				string[i]=s;
			}
			dash--;
		}
		for(int i=0;i<n;i++)
		{
			int j=i-1,intTemp=array[i];
			String strTemp=string[i];
			while(j>=0 && array[j]>intTemp)
			{
				array[j+1]=array[j];
				string[j+1]=string[j];
				j--;
			}
			array[j+1]=intTemp;
			string[j+1]=strTemp;
		}
		String result="";
		for(int i=0;i<n;i++)
		{
			result+=string[i];
			result+=" ";
		}	
		System.out.println(result);	
	}
}


	

