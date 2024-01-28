package string;

public class StringManipulation {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("chengannagari prasad");
		System.out.println("String :"+s);
	
		System.out.println("Length:" +s.length());
	
		for(int i=0;i<s.length();i++)
		{
		int p = i+1;
		 System.out.println(" position : "+p+" is "+s.charAt(i));
		}
		String str2 = new String(s.toString());
		int pos = str2.indexOf(" prasad");
		s.insert(pos," sravani");
		System.out.println("Modified String :"+s);
		
		s.setCharAt(13,'_');
		s.setCharAt(21,'_');
		
		
		System.out.println("String Now : "+s);
		
		s.append("-->daughter of sivaramprasad");
		System.out.println("Append String "+s);
		}

	}

