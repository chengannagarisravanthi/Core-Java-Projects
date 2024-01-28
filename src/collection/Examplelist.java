package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Examplelist 
{

	public static void main(String[] args) 
	{
		List names=new ArrayList();
		names.add("sravani");
		names.add("prasad");
		names.add("chengannagari");
		//System.out.println(names.get(0));
		System.out.println("list is:  "+names);
		System.out.println(names.indexOf("sravani"));  
		
		System.out.println(names.set(0, "sravanthi"));
		System.out.println("index 0 is replaced here  :"+names);
		
		Collections.sort(names); 
		System.out.println("after sorting:  "+names);
	
		//System.out.println(names);
//	    Iterator i=names.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		
	//	for (int i=0;i<names.size();i++) {
			    
			//System.out.println(names.get(i)); 
			
		//}
	}

}
