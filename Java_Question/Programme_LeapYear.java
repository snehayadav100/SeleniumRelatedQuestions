package Java_Question;

import java.util.Scanner;

public class Programme_LeapYear {

	public static void main(String[] args) {

			String str = "";
			do {
				int year;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a Number : ");
				System.out.println("Do You Want to Check again(Yes/No)");

				str = sc.next();
			} while (str.equals("yes"));
			System.out.println("Thank You ");

		}



	}


