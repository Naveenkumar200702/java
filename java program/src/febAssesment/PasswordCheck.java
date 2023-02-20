package febAssesment;
import java.util.*;
public class PasswordCheck {
	boolean findPassword(List<String> password,List<String> attemptList,String attempt,int i,int j)
	{
		if(j==attempt.length()+1)
		{
			if(i==attempt.length())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		if(password.contains(attempt.substring(i,j)))
		{
			attemptList.add(attempt.substring(i,j));
			i=j;
			j++;
		}
		else
		{
			j++;
		}
		return findPassword(password,attemptList,attempt,i,j);
	}
	public static void main(String[] args)
	{
		PasswordCheck object=new PasswordCheck();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the test cases");
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++)
		{
			List<String> passwordList=new ArrayList();
			System.out.println("Enter the size passwords");
			int size=sc.nextInt();
			//String[] password=new String[size];
			System.out.println("Enter elements");
			for(int j=0;j<size;j++)
			{
				String str=sc.next();
				passwordList.add(str);
			}
			System.out.println("Login attemp");
			String attempt=sc.next();
			List<String> attemptList=new LinkedList();
//			for(int j=0;j<password.length;j++)
//			{
//				passwordList.add(password[i]);
//			}
			boolean flag=object.findPassword(passwordList,attemptList,attempt,0,1);
			if(flag)
			{
				System.out.println(attemptList);
			}
			else {
				System.out.println("Wrong Password");
			}
		}
	}
}
