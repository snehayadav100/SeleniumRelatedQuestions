package Java_Question;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
	
			int num = 123455, count = 0;
			while (num > 0) {
				num = num / 10;
				count++;
			}
			System.out.println("Number of digits :" + count);

		}


	


	}


