package string;

public class Stringmethods {
	public static void main(String args[]) {
	String s="welcome to my home tour";
	System.out.println(s.substring(5));
	System.out.println(s.substring(3,7));
		//String x="1234567890";
		//System.out.println(x.substring(5));
	System.out.println("indexOf(s)="+s.indexOf('e'));
	System.out.println("lastIndexOf(s)="+s.lastIndexOf('e'));
	
	
	 String s1="Sravani"; 
	 String s2="Sravani"; 
	 String s3="deepa";
	 String i1="12345";
	 String i2="67897";
	 String i3="12345";
	 System.out.println(s1.compareTo(s2));
	 System.out.println(s1.compareTo(s3)); 
	 System.out.println(s3.compareTo(s1));
	 System.out.println(i1.compareTo(i2));
	 System.out.println(i3.compareTo(i1));
	 
	 
}

}
