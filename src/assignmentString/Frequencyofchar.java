package assignmentString;

public class Frequencyofchar {

	public static void main(String[] args) {
		 String str = "welcome to edubridge.";
	        char ch='w';
	      
	        int frequency = 0;

	        for(int i = 0; i < str.length(); i++) {
	            if(ch == str.charAt(i)) {
	                ++frequency;
	            }
	        }

	        System.out.println("Frequency of " + ch + " = " + frequency);

	}

}
