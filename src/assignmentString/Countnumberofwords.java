package assignmentString;
import java.util.*;
public class Countnumberofwords 
{
		
		public int endWitheOro(String str) 
		{
		  int l = str.length();
		  int ctr = 0;
		  str = str.toLowerCase();
		  for (int i = 0; i < l; i++) 
		  {
		    if (str.charAt(i) == 'e' || str.charAt(i) == 'o') 
			{
		      if (i < l-1 && !Character.isLetter(str.charAt(i+1)))
		        ctr++;
		      else if (i == l-1)
		        ctr++;
		    }
		  }
		  return ctr;
		}

		public static void main (String[] args)
		    {
			Countnumberofwords c= new Countnumberofwords();
		      String string =  "welcome to edubride";
		      System.out.println("string is: "+string);
		      System.out.println("The number of words ends eith e or o is: "+c.endWitheOro(string));
		    }
}
