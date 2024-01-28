package Constructors;

public class Simpleconstructor {
		String name;
		 Simpleconstructor(){
			System.out.println("Constructor is called");
			 name="sravani";
		 }

	public static void main(String[] args) {
		 Simpleconstructor obj=new  Simpleconstructor();
		System.out.println("the name is:"+obj.name);

	}

}
