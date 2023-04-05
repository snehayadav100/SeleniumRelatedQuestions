package Java_Question;

public class FindDuplicateArray {
	
public  static void main(String[]args) {
		int[] snt = { 2, 4, 6, 4, 7, 6 };
		for (int i = 0; i < snt.length; i++) {
			for (int j = i + 1; j < snt.length; j++) {
				if (snt[i] == snt[j]) {

					System.out.println(snt[i]);

				}
			}
		}}}
