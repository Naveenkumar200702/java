package febAssesment;
import java.util.*;
public class FindPairs {
	void Paris(int[] array,int size,int value,int cid,List<Integer> list)
	{
		if(cid==size)
		{
			int sum=0;
			for(int i:list)
			{
				sum+=i;
			}
			if(sum%value==0&&list.size()==2)
			{
				System.out.println(list);
			}
			return;
		}
		list.add(array[cid]);
		Paris(array,size,value,cid+1,list);
		list.remove(list.size()-1);
		Paris(array,size,value,cid+1,list);
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		FindPairs object=new FindPairs();
		System.out.println("Enter the size of Array");
		int size=input.nextInt();
		System.out.println("Enter elements");
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=input.nextInt();
		}
		System.out.println("Enter the Value");
		int value=input.nextInt();
		object.Paris(array,array.length,value,0,new ArrayList());
	}
}
