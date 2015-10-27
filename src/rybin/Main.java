package rybin;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> polindromesList = new ArrayList<Integer>();
		Polindome polindrome = new Polindome();
		
		polindrome.start(polindromesList);
		System.out.println("largest palindrome = " + polindrome.largestPolindrome(polindromesList));
	}
}
