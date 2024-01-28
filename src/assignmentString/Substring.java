package assignmentString;

public class Substring {

	public static void main(String[] args) {
		 String str = "learn java geeksforgeks is an online platfom to learn java";
	        
	        String strFind = " ";
	        int count = 0, fromIndex = 0;
	        
	        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
	            count++;
	            fromIndex++;
	            
	        }
	        
	        System.out.println("Total occurrences: " + count);
	}
}
//		String str = "JavaExamplesJavaCodeJavaProgram";
//		 
//		int count = 0, startIndex = 0;
//		 
//		Pattern p = Pattern.compile("Java", Pattern.LITERAL);
//		Matcher m = p.matcher(str);
//		 
//		while(m.find(startIndex)){
//		    count++;
//		    startIndex = m.start() + 1;
//		}
//		 
//		System.out.println("Total occurrences: " + count);
//
//	}

//}
