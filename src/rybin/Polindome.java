package rybin;

import java.util.ArrayList;

public class Polindome {
	
	public void start(ArrayList<Integer> list) {
		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				int value = i * j;
				if (polindromeCheck(value)) 
					list.add(value);		
				}
			}
	}
	
	public boolean polindromeCheck(int value) {
		int temp = value;
		int result = 0;
		int remainder = 0;
		do {
			remainder = temp % 10;
			result = result * 10 + remainder;
			temp = temp / 10;
		} while (temp > 0);
		if (result == value) {
			System.out.println(value);
			return true;
		}
		return false;
	}
	
	public int largestPolindrome(ArrayList<Integer> list) {
		int largest = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > largest)
				largest = list.get(i);
		}
		return largest;
	}
}

