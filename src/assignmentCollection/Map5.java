//Develop a method which iterates through the map M1 and creates an ArrayList with all 
//the Country names stored as keys. This method should return the ArrayList
package assignmentCollection;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
		 
		public class Map5 
		{

			public static void main(String[] args) 
			 {
		        Map<String,String> m1 = new HashMap<String,String>();
		        ArrayList <String> a=new ArrayList<String>();
		        
		        m1.put("1", "india");
		        m1.put("2", "europe");
		        m1.put("3", "germany");
		        m1.put("4", "mumbai");
		        for (Map.Entry<String,String> entry : m1.entrySet()) 
		        {
		        System.out.println("Key = " + entry.getKey()+", Value = " + entry.getValue());
		   
	 	        }
		        System.out.println("arraylist of m1: "+m1);
	        }

		}
