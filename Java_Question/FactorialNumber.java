package Java_Question;

public class FactorialNumber {

	public static void main(String[] args) {

		
		
		
		
		 // A factorial is a function that multiplies by every number below it//
		
			int num = 5; // 5=5*4*3*2*1=120 or 5=1*2*3*4*5=120
			int factorial = 1;
			for (int i = num; i >= 1; i--) {

				factorial = factorial * i;
				System.out.println("factorial number----" + i + "=" + factorial);
			}

		}


	}

