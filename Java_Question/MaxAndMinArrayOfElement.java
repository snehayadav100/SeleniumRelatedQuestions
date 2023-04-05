package Java_Question;

public class MaxAndMinArrayOfElement {
	
	
	public static void main(String[]args) {

		int d[] = { 55, 65, 75, 33, 56, 86 };
		int max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > max) {
				max = d[i];
			}
		}
		System.out.println("Maximum Element Array is: " + max);

		int b[] = { 55, 65, 75, 33, 56, 86 };
		int min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] < min) {
				min = d[i];
			}
		}
		System.out.println("Minimum Element Array is: " + min);

	}

			}




