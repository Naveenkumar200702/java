package assesment_feb_end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringConcedation {
	public static void main(String[] args) {
		String[] string = { "Abc", "Jhon", "cat", "Opera", "Noon", "noonfdhfhg", "tat" };

		List<String> result = new ArrayList();

		String answer = "";

		for (int i = 0; i < string.length; i++) {
			boolean array[] = new boolean[string.length];
			String str = string[i].toLowerCase();
			String value = string[i];
			array[i] = true;
			String temp="";
			for (int j = 0; j < string.length; j++) {
				if (j == i)
					continue;
				String str1 = string[j].toLowerCase();
				if (str.charAt(str.length() - 1) == str1.charAt(0) && array[j] != true) {
					array[j] = true;
					value += string[j];
					str += str1;
					j = 0;
				}
			}
			if (value.length() > string[i].length()) {
				result.add(value);
			}
		}
		
		System.out.println(result);
		
		for (String val : result) {
			if (val.length() > answer.length()) {
				answer = val;
			}
		}
		System.out.println(answer);
	}

}
