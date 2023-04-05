package Java_Question;

public class Occurance_Number {

	public static void main(String[] args) {

				String word="Hi I am dewa".toLowerCase();
				
				for (char chr='a'; chr<='z';chr++) {
					
				  int count =0;
				  
				for(int i=0; i<=word.length()-1; i++) {
					if (chr==word.charAt(i)) {
						count++;
					}
			   
				}if(count>0) {
					  System.err.println(chr+":"+ count);
				  }
					
				}}
			


			
			

	}

