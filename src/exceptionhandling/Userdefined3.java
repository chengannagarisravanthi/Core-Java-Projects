package exceptionhandling;
class names extends Exception{
	String s1;
	public names(String s2) {
		s1=s2;
	}
	public String toString() 
	{
	
		return ("done by= " + s1);
	}
}
public class Userdefined3 {
 public void givennames(int num) {
	if (num>10) {
		System.out.println("many names");
		
	}
	else {
		System.out.println("some names");
	}
}
	public static void main(String[] args)  {
		Userdefined3 obj=new Userdefined3();

		try{
			obj.givennames(8);
		    System.out.println("try block:stmts caused an exception ");
		    throw new names("sravani chengannagari" );
			
	      }
		catch (names e) {
			System.out.println("catch block deals the exception");
			System.out.println(e);
		}
	}

}