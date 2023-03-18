package pattern;

import java.util.Scanner;

public class Patern4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input");
		int n = input.nextInt();
		int sum = 5;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = (i - 1) * n + 1;
			} else {
				sum = i * n;
			}
			for (int j = n - 1; j >= 0; j--) {
				System.out.print(sum + " ");
				if (i % 2 != 0) {
					sum++;
		
				} else {
					sum--;
				}
			}
			System.out.println();
		}
	
	}

}
