package assignmentString;
import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.nextLine();
		String reverse=new String();
		String orgstr=str;
		int length=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			 reverse=reverse+str.charAt(i);
				if(orgstr.equals(reverse)) {
				System.out.println(orgstr+" is a palindrome");
			}
			else {
				System.out.println(orgstr+" is not a palindrome");
			}
		}*/
		String str = "radar";
		String str1 = "sravani";
		
	      String revstr =new String();
	      for(int i = str.length()-1; i >= 0 ; i--) {
	         revstr = revstr+str.charAt(i);
	      }
	      if(str.equals(revstr)) {
	         System.out.println(str+" is palindrome");
	      } else {
	         System.out.println(str+" is not palindrome");
	      }

	      
	      String revstr1 =new String();
	      for(int i = str1.length()-1; i >= 0 ; i--) {
	         revstr1 = revstr1+str1.charAt(i);
	      }
	      if(str1.equals(revstr1)) {
	         System.out.println(str1+" is palindrome");
	      } else {
	         System.out.println(str1+" is not palindrome");
	      }

	}

}
