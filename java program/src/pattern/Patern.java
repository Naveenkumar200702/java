package pattern;

import java.util.Scanner;

public class Patern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input");
		int n = input.nextInt();
		int repeat = 1;
		int i = 1;
		int value = 1;
		int count=1;
		while (count<n+1) {
		for (int j = 0; j <count; j++) {
			System.out.print(i);
			}
			if(i==value)
			{
				i++;
				value=0;
			}
			value++;
			System.out.println();
			count++;
		}
	}

}

