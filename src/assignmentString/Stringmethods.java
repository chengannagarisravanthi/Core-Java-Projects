package assignmentString;

public class Stringmethods {

	public static void main(String[] args) {
		String s1="sravani "; //string (literal stored in string constant pool)
		String s="DEEPA";
		System.out.println("s1:"+s1);
		System.out.println("s:"+s);
		System.out.println("character located at index 5 is : "+s1.charAt(5));
        System.out.println("appended to the end of the string : "+s1.concat("deepa")); 
        System.out.println("length of the string s1 : "+s1.length());
        System.out.println("replacing the letter s1 : "+s1.replace('a','A'));
        System.out.println(s.equalsIgnoreCase("deepa"));
        System.out.println(s.equalsIgnoreCase("apeed"));
        System.out.println("converting the lowercase string to uppercase s1 : "+s1.toUpperCase());
        System.out.println("converting the uppercase string to lowercase s : "+s.toLowerCase());
        System.out.println("............................");
        System.out.println("boolean endsWith and startsWith:");
        System.out.println(s.endsWith("PA"));
        System.out.println(s.endsWith("DEE"));
        System.out.println(s.startsWith("DEE"));
        
        System.out.println("............................");
        System.out.println("using trim method to remove blank spaces before string:");
        String s2="     deepa and sravani are best     ";
        System.out.println(s2.trim()+" friends");
        System.out.println("............................");
        System.out.println("using split method to separate the sentence as words:");
        String s3 ="sravani prasad chengannagari";
        String str[]= s3.split(" ");
        for(int i=0;i<str.length;i++)
        {
        System.out.println(str[i]);


	}
	}
}
