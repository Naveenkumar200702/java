package learningRecursion;

public class FibanociRecursion1 {
	static int fibonaci(int number)
	{
		if(number<=1)
		{
			return number;
		}
		return fibonaci(number-1)+fibonaci(number-2);
	}
	public static void main(String[] args)
	{
		int fibo=fibonaci(4);
		System.out.println(fibo);
	}

}
