//Develop a java class with a instance variable CountryMap HashMap (M1) 
//* add a method saveCountryCapital(String CountryName, String capital) , 
//* the method should add the passed country and capital as key/value in the map M1 and return the 
//Map (M1).
package map;
import java.util.HashMap;

import org.w3c.dom.css.Counter;

public class Map1 {


		public static void main(String[] args) {
			CountryMap countryMap = new CountryMap();

			countryMap.saveCountryCapital("India", "Delhi");
			countryMap.saveCountryCapital("Japan", "Tokyo");
			countryMap.saveCountryCapital("USA", "Washington D.C.");
			
			System.out.println(countryMap.getCapital("India"));
			System.out.println(countryMap.getCountry("Tokyo"));
			System.out.println(countryMap.toArrayList());
			
			HashMap<String, String> M2 = countryMap.swapKyeValue();
			System.out.println(M2);
		}

	}