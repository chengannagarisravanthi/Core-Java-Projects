package collection;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
				map.put("hithish", "178");
				map.put("aayan", "232");
				map.put("anand", "129");
				map.put("anand", "199");
				
				System.out.println("Name: " +map.get("hithish"));
				System.out.println("name " + map.get("aayan"));
				System.out.println("name: " +map.get("anand"));
				System.out.println("name: " +map.get("anand"));
				
	}

}
