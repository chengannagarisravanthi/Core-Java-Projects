package exceptionhandling;

class weight extends Exception {
	String str1;

	public weight(String msg) {
		super(msg);
	}
}
public class Userdefined2
   {
	void handleweight(int kgs) throws weight{
		if (kgs > 60) 
		{
			throw new weight("over weight");
		} 
		else 
		{
			System.out.println("less weight");
		}
	}
   public static void main(String[] args) throws weight  {
		Userdefined2 obj = new Userdefined2();
		try {
		obj.handleweight(47);
		System.out.println("valid weight");
		}
		catch(weight e)
		{
			System.out.println("catch block");
			System.out.println(e);
		}
	}
   }
   
   