package Inheritance;
interface interface1 {
	void a();
		
	}
interface interface2{
	void b();
	
}
public class Interface implements interface1,interface2 {

	public static void main(String[]args) {
	Interface obj=new Interface();
	obj.a();
	obj.b();
	}

	@Override
	public void a() {
		System.out.println("implementation of interface1");
		
	}

	@Override
	public void b() {
		System.out.println("implementation of interface2");
		
	}

}
