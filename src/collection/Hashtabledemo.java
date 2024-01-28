package collection;
import java.util.*;
public class Hashtabledemo {

	public static void main(String[] args) {
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		
		ht.put("one",1);
		ht.put("two",2);
		ht.put("three",3);
		ht.put("four",4);
		ht.put("five",5);
		System.out.println(ht);
		
	}

}
