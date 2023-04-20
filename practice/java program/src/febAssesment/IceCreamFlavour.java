package febAssesment;
import java.util.*;
public class IceCreamFlavour {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		List<List<Integer>> result=new LinkedList();
		//Getting inputs
		System.out.println("Enter the Number of Flavours");
		int flavours=input.nextInt();
		int costOfIceCream[]=new int[flavours];
		System.out.println("enter elements");
		for(int i=0;i<flavours;i++)
		{
			costOfIceCream[i]=input.nextInt();
		}
		System.out.println("Enter the total money");
		int money=input.nextInt();
		//output Execution
		int i=0,j=1;
		while(j<costOfIceCream.length)
		{
			if(j==costOfIceCream.length)
			{
				i++;
				j=i+1;				
			}
			if(i==costOfIceCream.length)
			{
				break;
			}
			if(costOfIceCream[i]+costOfIceCream[j]==money)
			{
				List<Integer> list=new ArrayList();
				list.add(i+1);
				list.add(j+1);
				result.add(list);	
			}
			j++;
		}
		System.out.println(result);
	}
}
