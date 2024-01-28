package string; 
import java.util.StringJoiner;
public class Stringjoiner {

	public static void main(String[] args) {
		

		 //StringJoiner joinNames = new StringJoiner(","); 
		StringJoiner joinNames = new StringJoiner(",", "{","}"); 
		 
		joinNames.add("1");
		 joinNames.add("sravani"); 
		 joinNames.add("2");
		 joinNames.add("chengannagari"); 
		 joinNames.add("  "); 
		 joinNames.add("deepa"); 
		 joinNames.add("kathi"); 
		 
		 System.out.println(joinNames); 
		
		 
		 /*joinNames.add("123"); 
		 joinNames.add("456");
		 joinNames.add("789"); 
		 System.out.println(joinNames); */
		
		 

		}

	
	}
