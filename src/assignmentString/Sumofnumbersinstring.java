package assignmentString;
import java.util.*;
public class Sumofnumbersinstring {
	
		public int sumOfTheNumbers(String str) 
		{
		  int le = str.length();
		  int sum = 0;
		  String temp = "";
		  for (int i = 0; i < le; i++) 
		  {
		    if (Character.isDigit(str.charAt(i))) 
			{
		      if (i < le-1 && Character.isDigit(str.charAt(i+1))) 
			  {
		        temp += str.charAt(i);
		      }
		      else 
			  {
		        temp += str.charAt(i);
		        sum += Integer.parseInt(temp);
		        temp = "";
		      }
		    }
		  }
		  return sum;
		}

		public static void main (String[] args)
		    {
			Sumofnumbersinstring s= new Sumofnumbersinstring();
		      String string =  "1 sravani got 20 and 25 marks";
		      System.out.println("string is: "+string);
		      System.out.println("The sum of numbers in string is: "+s.sumOfTheNumbers(string));
		      

	}

}
