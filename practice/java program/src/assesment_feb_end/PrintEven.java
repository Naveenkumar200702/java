package assesment_feb_end;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintEven {
	static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input");
		int number = input.nextInt();
		number = number + 1;
		List<Integer> odd = new ArrayList();
		
		System.out.print("Even numbers: ");
		while (isPrime(number)) {
			if (number % 2 == 0) {			
				System.out.print(number+",");
			} else {
				odd.add(number);
			}
			number++;
		}
		
		System.out.print("Odd number: ");
		for(int i=odd.size()-1;i>=0;i--)
		{
			System.out.print(odd.remove(i));
		}
		
	}

}
