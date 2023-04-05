package Java_Question;

public class Palidrom_String {
	
	
	public static void main(String[]args) { 
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("Enter a String :");
		//		String str = sc.next();
		String str = "ma'am";
		String org_str = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println(org_str + " is a Palindrome String");
		} else {
			System.out.println(org_str + " Not is a Palindrome String");
		}
	}


	

}
