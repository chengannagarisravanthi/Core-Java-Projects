package string;

public class Booleanequals {

	public static void main(String[] args) {
		String s1="welcome to my home";
		String s2="welcome to my home";
		String s3=new String("welcome to my home" );
		String s4=new String("welcome to my home" );
		
		if(s1.equals(s2))   
		{
			System.out.println("s1 is identical to s2");
		}
		else 
		   {
				System.out.println("s1 is not identical to s2");
			}
		if (s1==s2) 
		{
			System.out.println("s1 and s2 are same strings");
		}
		else
		{
			System.out.println("s1 and s2 are not same strings");
		}
		
		
		
		
		if(s1.equals(s3))   
		{
			System.out.println("s1 is identical to s3");
		}
		else 
		   {
				System.out.println("s1 is not identical to s3");
			}
		if (s1==s3) 
		{
			System.out.println("s1 and s3 are same strings");
		}
		else
		{
			System.out.println("s1 and s3 are not same strings");
		}
		
		
		
		
		if (s3==s4) 
		{
			System.out.println("s3 and s4 are same strings");
		}
		else
		{
			System.out.println("s3 and s4 are not same strings");
		}
		
		if(s3.equals(s4))   
		{
			System.out.println("s3 is identical to s4");
		}
		else 
		   {
				System.out.println("s3 is not identical to s4");
			}
		
		
		
		
		if(s2.equals(s4))   
		{
			System.out.println("s2 is identical to s4");
		}
		else 
		   {
				System.out.println("s2 is not identical to s4");
			}
		
		if (s2==s4) 
		{
			System.out.println("s2 and s4 are same strings");
		}
		else
		{
			System.out.println("s2 and s4 are not same strings");
		}
		}

	}
