package Inheritance;
class sem11{
	int a,b;
	public void input()
	{
		a=10;
		b=5;
	}
	public void display()
	{
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
	}
}
interface sem22
{
	static final int x=50;
	public abstract void show();
}
interface sem33
{
	static final int x=100;
	public abstract void speed();
}

public class MultipleInheritance extends sem11 implements sem22{

	public static void main(String[] args) 
	{
		 MultipleInheritance m=new  MultipleInheritance();
		 m.input();
		 m.display();
		 m.speed();
		 m.show();
		 
	}
	//@override
	public void show()
	{
		System.out.println("this is show abstract method");
		System.out.println("value of x:" + sem22.x);
		System.out.println("value of x:" + sem33.x);

    }
	public void speed()
	{
		System.out.println("this is speed abstract method");
	}
}	
