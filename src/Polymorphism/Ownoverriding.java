package Polymorphism;
class A{
	public static int display(int a,int b) {
		return a*b;
		 
	}
}
	class B extends A{

		void display() {
			System.out.println("B class inherited from A");
		}
	}
	class C extends A{
		void display() {
			System.out.println("C class also inherited from A");
		}
			
}
public class Ownoverriding {

	public static void main(String[] args) {
		System.out.println(A.display(2,3));
	
		B b=new B();
		C c=new C();
		
		b.display();
		c.display();
       

	}

}
