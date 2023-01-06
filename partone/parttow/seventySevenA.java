import java.util.*;
public class seventySevenA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("____");
        for (int i = 1; i < size; ++i) //insersionsort
		{
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
			{
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
		}
		System.out.println("____");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}