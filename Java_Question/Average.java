package Java_Question;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		//final static void average() {
			int a, b, sum;
			double avg;

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First No: ");
			a = sc.nextInt();

			System.out.println("Enter Second No: ");
			b = sc.nextInt();
			sum = a + b;
			avg = ((a + b) / 2);

			System.out.println("sum :" + sum + "\nAverage :" + avg);
		}


	}


