package febAssesment;
import java.util.*;
public class SubSet {
	void findSubSet(int[] elements,int cid,int length,List<Integer> subSet,List<List<Integer>> result)
	{
		if(cid==length)
		{
			result.add(new ArrayList(subSet));
			return;
		}
		subSet.add(elements[cid]);
		findSubSet(elements,cid+1,length,subSet,result);
		subSet.remove(subSet.size()-1);
		findSubSet(elements,cid+1,length,subSet,result);
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=input.nextInt();
		int elements[]= new int[size];
		List<List<Integer>> result=new LinkedList();
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++)
		{
			elements[i]=input.nextInt();
		}
		new SubSet().findSubSet(elements,0,3,new ArrayList(),result);	
		System.out.println(result);
	}

}
