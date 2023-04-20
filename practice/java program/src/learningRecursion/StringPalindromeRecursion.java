package learningRecursion;

public class StringPalindromeRecursion {
	static boolean checkPalindrome(String string,int start)
	{
		if(start>=string.length()/2)
			return true;
		if(string.charAt(start)!=string.charAt(string.length()-start-1))
		{
			return false;
		}	
	return checkPalindrome(string,start+1);
	}
	public static void main(String[] args)
	{
		String string="MADAn";
		System.out.println(checkPalindrome(string,0));
	}
}
