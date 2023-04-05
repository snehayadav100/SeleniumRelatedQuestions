package Java_Question;

public class Duplicate_Value {

	public static void main(String[] args) {

				
				 String[] element= {"dewa","shubh","baby","chotu","dewa",};
			   String duplicate="baby";
				 for (int i = 0; i < element.length; i++) {
				 for (int j = i+1; j < element.length; j++) {
				  if(element [i]==element[j]){
					  duplicate=element[j]; 
				 
				 System.out.print(duplicate); 
				 }
				 }}}}

	


