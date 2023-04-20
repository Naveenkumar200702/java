import java.util.*;
public class eightyNineA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=sc.nextLine();
		int index=-1;
		String temp="";
		String[] arr=new String[str.length()];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				index++;
				arr[index]=temp;
				temp="";
			}
			else if(i==str.length()-1)
			{
				temp+=str.charAt(i);
				index++;
				arr[index]=temp;
				
			}
			else
			{
				temp+=str.charAt(i);
			}
		}
		for(int i=0;i<=index;i++)
		{
			System.out.println(arr[i]);
		}
	}
}