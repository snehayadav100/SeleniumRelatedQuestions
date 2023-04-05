package Java_Question;

public class Swappinng {

	public static void main(String[] args) {
		
					int a = 10, b = 20; // Logic1== Third Variable Using
					System.out.println("Before swapping value are..." + a + " " + b);
					int t = a;
					a = b;
					b = t;
					System.out.println("After swapping value are..." + a + " " + b);

					int s = 10, g = 20; // Logic2== Two Variable Using
					System.out.println("Before swapping value are..." + s + " " + g);
			
					s=s+g;
					g=s-g;
					s=s-g;
					System.out.println("After swapping value are..." + s + " " + g);

			int c = 10, d = 20; // Logic3== Two Variable Using
			System.out.println("Before swapping value are..." + c + " " + d);

			c = c + d;
			d = c - d;
			c = c - d;
			System.out.println("After swapping value are..." + c + " " + d);

		}


	}


