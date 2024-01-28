package Polymorphism;
class superclass
{
	int b;
	public superclass(int a)
	{
		System.out.println(a+   " super class");
	}
	public void move() 
	{
		System.out.println(b+"this is a super class");
    }
}
class  childclass extends superclass
{
	public childclass (int x,int y)
	{
		super (x);
		super.b=10;
		System.out.println("child class   "+y);
	}
	public void move()
	{
		super.move();
		System.out.println("this is a child class  "+b);
	}
}
public class Methodoverriding 
{

public static void main(String[] args)
    {
		childclass obj=new childclass(10,20);
        obj.move();
        
	}

}
