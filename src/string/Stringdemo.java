package string;

public class Stringdemo 
{

	public static void main(String[] args) 
	{
		String s1="sravani "; //string (literal stored in string constant pool)
		char[] ch= {'d','e','e','p','a',' '};
            String s2=new String(ch);  //char to string(stored in heap memory)
            String s3=new String("are best friends");  ///creating java string
            System.out.print(s1);
            System.out.print(s2);
            System.out.print(s3);

		
		//char demo[]= {'d','e','e','p','a',' '};
		//String s=new String(demo);      ///string constructor
		//System.out.println("String is:"+s);
		
		
		
		
	}

}
