import java.io.*;
import java.util.*;
public class sixtyFourB{
	public static void main(String args[])
		throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int arr1[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.arraycopy(arr,0,arr1,0,size);
		System.out.println("array copy");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
		