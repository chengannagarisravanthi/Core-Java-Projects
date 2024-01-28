package exceptionhandling;

 class valid extends Exception 
 {
	 String str1;
	 public valid(String str2)  
	 {
		 
		  str1=str2;
	 }
	 public String  toString()
	 {
		 return("name: "+str1);
	 }
}
public class Userdefined1 {

	public static void main(String[] args) {

            try {
				System.out.println("valid string");
            	throw new valid("sravani chengannagari");
            }
            catch(valid e)
            {
            	System.out.println("catch block");
            	System.out.println(e);
            }
	}

}
