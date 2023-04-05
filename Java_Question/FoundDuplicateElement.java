package Java_Question;

public class FoundDuplicateElement {

	public static void main(String[] args) {
		

			String str[] = { "Ram", "Shyam2", "flag", "Manish", "Shyam2", "Snjay", "Sanjay", "Simran" };
			boolean flag = false;

			for (int i = 0; i < str.length; i++) {
				for (int j = i + 1; j < str.length; j++) {
					if (str[i] == (str[j])) {
						System.out.println("Found Dublicate Element :" + str[i]);
						flag = true;
					}

				}
			}
			if (flag == false) {
				System.out.println("Dublicate Element Not Found");
			}
			//	String str1[]= {"Ram","Shyam2","Shyam2","Manish","Shyam2","Sanjay","Sanjay","Simran"};
			//	HashSet langs= new HashSet();
			//      for (int i = 0; i < str1.length; i++) {
			//		System.out.println(langs.add(0));

		}

	
		}

		
		
