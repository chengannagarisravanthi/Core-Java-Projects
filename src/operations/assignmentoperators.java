package operations;

public class assignmentoperators {

	public static void main(String[] args) {
		int x=12;
		int y=15;
		int z=25;
		int a=10;
		int b=5;
		int c=6;
		int d=9;
		int e=10;
		x+=2;
		y-=2;
		z*=2;
		a/=2;
		b^=1;
		c&=1;
		d|=1;
		e%=2;
		System.out.println("the assignment values of x,y,z,a,b,c,d,e");
		System.out.println("the value of x is"+x);
		System.out.println("the value of y is"+y);
		System.out.println("the value of z is"+z);
		System.out.println("the value of a is"+a);
		System.out.println("the value of b is"+b);
		System.out.println("the value of c is"+c);
		System.out.println("the value of d is"+d);
		System.out.println("the value of e is"+e);
		
		System.out.println("the assignment shift values of f,g,h");
		int f=10;
		int g=20;
		int h=25;
		f>>=2;
		g<<=2;
		h>>>=2;
		System.out.println("the value of f is"+f);
		System.out.println("the value of g is"+g);
		System.out.println("the value of h is"+h);

	}

}
