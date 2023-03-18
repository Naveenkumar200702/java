package mentorquestion;

public class NumberWords {
	public static void main(String[] args) {
		int n = 919;
		int result = 0;
		String words = "";
		int digits;
		if (n <= 10)
			digits = 1;
		else if (n < 100)
			digits = 10;
		else
			digits = 100;
		while (n != 0) {
			int num = n % 10;
			result = result * 10 + num;
			n = n / 10;
		}
		while (result != 0) {
			int num;
			if (result >= 11 & result <= 19) {
				digits = 11;
				num = result % 10;
			}else {
				num = result % 10;
			}	
			words += findWords(digits, num);
			result = result / 10;
			if (digits == 100 && result > 1)
				words += " and ";
			if (digits == 11)
				break;
			digits /= 10;
		}
		System.out.println(words);
	}

	private static String findWords(int digits, int num) {
		String[] hundreds = { "", "One Hundred ", "Two Hundred ", "Three Hundred ", "Four Hundred ", "Five Hundred ",
				"Six Hundred ", "Seven Hundred ", "Eight Hundred ", "Nine Hundred " };
		String[] tens = { "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety ",
				"Hundred " };
		String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen", "Twenty" };
		String[] ones = { "", "One", "Two", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight", "Nine ", "Ten" };

		if (digits == 100) {
			return hundreds[num];
		} else if (digits == 10) {
			return tens[num];
		} else if (digits == 11) {
			return teens[num];
		} else if (digits == 1) {
			return ones[num];
		}
		return "";
	}

}
