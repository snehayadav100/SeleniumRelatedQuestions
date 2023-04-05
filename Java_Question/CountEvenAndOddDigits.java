package Java_Question;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
	
	

			int num = 234566;
			int even_count = 0;
			int odd_count = 0;
			int rem;
			while (num > 0) {
				rem = num % 10;
				if (rem % 2 == 0) {
					even_count++;
				} else {
					odd_count++;
				}
				num = num / 10;
			}
			System.out.println("Number of even number:" + even_count);
			System.out.println("Number of odd number:" + odd_count);

		}

	}


