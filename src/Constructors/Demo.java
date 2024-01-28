package Constructors;

public class Demo {
	public void rect(int l,int b)
	{
		System.out.println("Area of rect" + (l*b));
	}
	public int sub(int a,int b) 
	{
		return a-b;
	}
	public static void string() 
	{
		System.out.println("demo of constructors:");
	}

	public static void main(String[] args) {
           Demo d=new Demo();
           Demo.string();
           d.rect(2,5);
           System.out.println(d.sub(3, 2));
           

	}

}
