package exceptionhandling;
public class Exceptionhandling {
	/*public static void main(String[] args) {
		System.out.println("showing example of exception handling");
		System.out.println("it will print now without any exception");
		int a=3;
		char c='a';
		int i=5/0;
		System.out.println("now this was showing an error due to arithematic exception occured");
		System.out.println("we can handle it by using exception handling");
		}
	}*/
	
	/*public static void main(String[] args) {
		try {
		System.out.println("showing example of exception handling");
		System.out.println("it will print now without any exception");
		int a=3;
		char c='a';
		int i=5/0;
		System.out.println("now this was showing an error due to arithematic exception occured");
		System.out.println("we can handle it by using exception handling");
		}
		catch(Exception e) {
			System.out.println("exception occured"+e);
		}*/
		public void input() {
			try {
				System.out.println("showing example of exception handling");
				System.out.println("it will print now without any exception");
				int a=3;
				char c='a';
				int i=5/0;
				System.out.println("now this was showing an error due to arithmatic exception occured");
				System.out.println("we can handle it by using exception handling");
				}
				catch(Exception e) 
			    {
					System.out.println("exception occured  "+e);
				}
		  }
			public  void output()
			{
				System.out.println("this is an output shown");
			}
			public static void main(String[] args) 
			{
				Exceptionhandling E=new Exceptionhandling();
				E.input();
				E.output();
			}
	}