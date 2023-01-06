import java.io.*;
import java.util.*;
public class sixtyFourA{
	public static void main(String args[])
		throws NumberFormatException,IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int size=Integer.parseInt(br.readLine());
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=Integer.parseInt(br.readLine());
	}
	int arr1[]=new int[size];
	arr1=arr.clone();//using clone..
	for(int i=0;i<size;i++)
	{
		System.out.println(arr1[i]);
	}
		
	}
}