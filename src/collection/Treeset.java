package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> name=new TreeSet<String>();
//		name.add("sravani");
//		name.add("sravanthi");
//		name.add("harika");
//		name.add("sasirekha");
//		name.add("sasirekha");
//		name.add("madhu");
		
		name. add("s"); 
		name.add("r");
		name.add("a"); 
		name.add("v");
		name.add("a");
		name.add("n");
		name.add("i");
	System.out.println(name);
		//name.remove("harika");
		
//		name.add("837");
//		name.add("254")
//		name.add("789");
		//System.out.println(name);
		Iterator i=name.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

}
