package exceptionhandling;

class MyException extends Exception 
{
	String s1;

	public MyException(String s2)
	{
		super (s2);
		s1=s2;
	}
	public String toString() 
	{
		return ("name = " + s1);
	}
}

public class Userdefined 
{
	public static void main(String args[])
	{
		try 
		{
		
			System.out.println("my name is given below");
		throw  new  MyException("sravani chengannagari");
		} 
		catch (MyException e)
		{
			System.out.println("catch block");
			System.out.println(e);
		}
		finally 
		{
			System.out.println("final output will be given here");
		}
	}
}