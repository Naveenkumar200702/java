package interviewCall;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Interview call ");
		Queue<String> list=new ArrayDeque<>();
		boolean check=true;
		while(check==true)
		{
			System.out.println("1. enter the names");
			System.out.println("2. Remove names");
			System.out.println("3. exit");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("enter name");
				String s=sc.next();
				list.add(s);
				int num=1;
				for(String a:list)
				{
					System.out.println(num++  +" " +a);
					if(num==3)
						break;
				}
				System.out.println("___________");
			}
			else if(option==2)
			{
				if(list.isEmpty())
				{
					System.out.println("Interview is Done with All candidates");
					return;
				}
				list.remove();
				int num=1;
				for(String a:list)
				{
					System.out.println(num++ +" " +a);
					if(num==3)
						break;
				}
				System.out.println("______________");
				
			}
			else if(option==3)
			{
				check=false;
			}
			
		}
		
	
	}

}
