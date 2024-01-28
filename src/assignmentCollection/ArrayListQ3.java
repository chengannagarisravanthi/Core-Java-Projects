//Create an ArrayList which will be able to store only Strings. 
//Create a printAll method which will print all the elements 
//using an Iterator.

package assignmentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListQ3 {

	public static void main(String[] args) {
		
		//ArrayList<String> list=new ArrayList();
		//LinkedList<String> list=new LinkedList();
		Vector<String> list = new Vector<>();
		list.add("welcome");
		list.add("to");
		list.add("my");
		list.add("home tour");
		printAll(list);   //printAll method is used to print all the list
		
	}
		
	public static void printAll(List<String> list) {
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
