package Inheritance;
class A0
{
	public void methodA0() {
		System.out.println("class A0 method is called");
	}
}
class A1 extends A0{
	public void methodA1() {
		System.out.println("class A1 method is called from A0");
	}
	
}
class A2 extends A1{
	public void methodA2() {
		System.out.println("class A2 method is called from A1");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		A0 obj=new A0();
		A1 obj1=new A1();
		A2 obj2=new A2();

		obj.methodA0();
		obj1.methodA1();
		obj2.methodA2();
		
	}

}

		
			