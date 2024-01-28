package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap treeMap = new TreeMap( );
		treeMap.put("name:", "sravani");
		treeMap.put("id:", new Integer(1));
		treeMap.put("location:", "andhrapradesh");
		
		Collection values = treeMap.values();
		Iterator iterator = values.iterator( );
		System.out.println(" VALUES....");
		while (iterator.hasNext())
		 {
		 System.out.println(iterator.next( ));
		}
	}

	}