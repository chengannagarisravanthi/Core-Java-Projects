package Inheritance;

abstract class teacher{
	abstract void run();
	int Area (int a) {
		return a*a;
	}
	abstract void stop();
	int add (int a,int b,int c) {
		return a*b*c;
	}
}
 class student extends teacher{
	void run() {
		System.out.println("abstract");
		
	}
	void show() {
		System.out.println("it cannot be instantiated");
	}
	void display() {
		System.out.println("it can also have constructors and static methods");
	}
	@Override
	void stop() {
		System.out.println("it can be final");
		
	}
}
public class Abstract {

	public static void main(String[] args) {
		student obj=new student();
		System.out.println("area:"+obj.Area(4));
		System.out.println("add:"+obj.add(1, 4, 5));
		obj.run();
		obj.show();
        obj.display();
        obj.stop();
	}

}
