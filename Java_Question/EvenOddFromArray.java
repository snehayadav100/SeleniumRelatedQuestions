package Java_Question;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
	
			int st[] = { 1, 3, 2, 5, 6, 9, 8 };

			for (int i = 0; i < st.length; i++) {

				if (st[i] % 2 == 0) {
					System.out.println("Even number in array :" + st[i]);

				} else if (st[i] * 2 != 0) {
					System.out.println("Odd number in array :" + st[i]);

				}
			}}
}