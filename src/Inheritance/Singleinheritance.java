package Inheritance;
import java.util.*;
class A
{
	private int M1,cp,java;
	public void input() 
	{
		M1=80;
		cp=70;
		java=60;
	
    }
	public void output() 
	{
		System.out.println("...........A............");
		System.out.println("M1:"+M1);
		System.out.println("cp"+cp);
		System.out.println("java"+java);
		
    }
}

class B extends A
{
public int percentage;
public void input1() 
    {
		percentage =70;
    }
	public void output1() 
    {
System.out.println("...........B............");
System.out.println("percentage of all subjescts is:"+percentage);
    }
}
class C extends A
 {
String Name;
Scanner sc=new Scanner(System.in);
public void input2()
   {
System.out.println("...........C............");
System.out.println("enter the student name");
		Name=sc.nextLine();
   }
public void output2()
	{
System.out.println("student name:"+Name);
		
    }
	
	
}
public class Singleinheritance
{

	public static void main(String[] args) 
	{
		A obj=new A();
		obj.input();
		obj.output();
		
		
		B obj1=new B();
		obj1.input1();
		obj1.output1();
		
		C obj2=new C();
        obj2.input2();
        obj2.output2();
	}

}
