package stringPrograms;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		int i=0,number1=0,number2=1,number3;
		FibonacciSeries object=new FibonacciSeries();
		while(i<5)
		{
			number3=number1+number2;
			if(object.isprime(number3))
			{
				System.out.println(number1+number2);
				i++;
			}
			number1=number2;
			number2=number3;
		}
	}
	boolean isprime(int number)
	{
		if(number<2)
			return false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%2==0)
			{
				return false;
			}
		}
		return true;
	}
}
