package Java_Question;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		


			int i = 1;
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");

			int a = sc.nextInt();
			while (i < a) {
				if (a % i == 0) {
					sum = sum + i;
				}
				i++;
			}
			if (sum == a) {
				System.out.println(i + " is a perfect number");
			} else {
				System.out.println(i + " is not a perfect number");
			}
		}

		/**
		 * this program is used to find 
		 */
		

	}


