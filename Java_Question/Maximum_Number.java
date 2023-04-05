package Java_Question;

public class Maximum_Number {

	public static void main(String[] args) {
		
	 int []a= {1,2,3,4,15};
	 int duplicate=0;
	 for (int i = 0; i < a.length; i++) {
		if(a[i]>duplicate) {
			duplicate=a[i];
		}	
		}
	System.out.println("Maximum num="+duplicate);

	}
	}

