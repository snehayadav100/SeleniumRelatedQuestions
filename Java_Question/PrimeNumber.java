package Java_Question;

public class PrimeNumber {

	public static void main(String[] args) {
		

		  // Which has only 2 factors 1 and itself //
		
			int num = 45;
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");
			}
	
	}
	
}

