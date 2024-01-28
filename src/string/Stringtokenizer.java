package string;
import java.util.*;

public class Stringtokenizer {

	public static void main(String[] args) {
		{
		 System.out.println("1st  string ");
		 StringTokenizer s1 = new StringTokenizer("sravani prasad chengannagari", ", ");
		 while (s1.hasMoreTokens())
		 
		{
		 System.out.println(s1.nextToken());
		}
		 
		 System.out.println("....................");
		 System.out.println("2nd string ");
		 StringTokenizer s2 = new StringTokenizer("deepa shekar kathi", " ");
		 while (s2.hasMoreTokens())
		 {
		 System.out.println(s2.nextToken());
		 } 
		 
		 System.out.println("....................");
		 System.out.println("3rd string ");
		 StringTokenizer s3 = new StringTokenizer("sravani : & : deepa", ":", true);
		
		 while (s3.hasMoreTokens())

		{
		 System.out.println(s3.nextToken());
		 
		}
		 
		}
}
}


