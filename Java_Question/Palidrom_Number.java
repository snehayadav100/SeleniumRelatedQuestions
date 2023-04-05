package Java_Question;

public class Palidrom_Number {

	public static void main(String[] args) {
		
			int number = 1371;
			int r;
			int sum = 0;
			int original = number;
			while (number > 0) {
				r = number % 10;
				sum = sum * 10 + r;
				number = number / 10;

			}
			//  System.out.println(sum);
			if (sum == original) {
				System.out.println("Palindrome No.");
			} else {
				System.out.println("Not Palindrome No.");

			}
		}

	
		

	}


