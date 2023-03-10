package chatbotstack;
import java.util.*;
public class ChatbotStack {
	private Stack<int[]> stack=new Stack();
	public static void main(String[] args)
	{
		ChatbotStack object=new ChatbotStack();
		object.stack.push(new int[2]);		
		object.stackImplementation();		
	}
	void stackImplementation()
	{
		Scanner input= new Scanner(System.in);
		while(true)
		{
			print(Level(stack.peek()));	
			System.out.print("Enter an Option :");
			int option=input.nextInt();
			if(option==99)
			{
				stack.clear();
				break;
			}
			if(option==9)
			{
				stack.pop();
				if(stack.isEmpty())
				{
					break;
				}
			}
			else {
				int value[]=stack.peek();
				if(value[0]>0&&value[1]>0)
				{
					System.out.println("\t************");
					System.out.println("\tEnter a valid option");
					System.out.println("\t************");
				}
				else if(value[0]>0&&value[1]==0)
					stack.push(new int[] {value[0],option});
				
				else if(value[0]==0&&value[1]>0)
					stack.push(new int[]{option,0}); 
				
				else
					stack.push(new int[]{0,option});
			}
		}
		System.out.println("Thanks for Visiting our Website...");		
	}
	void print(String[] str)
	{
		for(String string:str)
		{
			System.out.println(string +"\n");
		}	
		System.out.println("9 GoBack\n");
		System.out.println("99 Exit\n");
	}
	String[] Level(int[] arr)
	{	
		// 3-dimention array to get print values
		String[][][] content= {
				{{"\tEnter Language","1. English"}, {"1.Recharge","2. CallerTune","3.Balance"}},
				{{"\tChoose an option","1. 249 Unlimited calls for 1 month","2. 19 1 G.B data for One day"},
				{"Plan one Selected Succesfully"},{"Plan two Selected succesfully",}},
				{{"\tChoose an option","1. Jimiky ponu","2. Ranjithamey"},{"Song One Selected"},{"Song two selected"}},
				{{"\tChoose an option","1. CurrentBalance"},{"Your balance is Rs.0.0"}}};	
		try {
			return content[arr[0]][arr[1]];		
			}
		catch(Exception e)
		{
			System.out.println("\t************");
			System.out.println("\tEnter a valid option");
			System.out.println("\t************");
			stack.pop();
			int[] current=stack.peek();
			return content[current[0]][current[1]];
		}	
	}	
}