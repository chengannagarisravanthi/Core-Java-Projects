package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) {
		//sorted set is a implementation of treeset
		SortedSet<String> sortedset=new TreeSet<String>();
		sortedset.add("s"); 
		sortedset.add("r");
		sortedset.add("a"); 
		sortedset.add("v");
		sortedset.add("a");
		sortedset.add("n");
		sortedset.add("i");
		
		System.out.println(sortedset);

	}

}
