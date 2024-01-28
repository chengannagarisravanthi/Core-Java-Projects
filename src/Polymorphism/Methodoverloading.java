package Polymorphism;
class shape{
	public void add(int a,int b)
	{
		int add=a+b;
		System.out.println("sum is:"+add);
	}
	public void area(int side) {
		int res=side*side;
		System.out.println("area of square is:"+res);
	}
	public void area(int r,double pi) {
		double res=pi*r*r;
		System.out.println("area of circle is:"+res);
	}
}

public class Methodoverloading {

	public static void main(String[] args) {
	shape obj=new shape();
	obj.add(4, 7);
	obj.area(5);
	obj.area(4,3.14);

	}

}
