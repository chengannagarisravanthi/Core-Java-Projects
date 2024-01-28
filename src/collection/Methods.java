package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Methods {

	public static void main(String[] args) {
	   //Set list=new TreeSet();                            
		//Set <String>list=new TreeSet();        //sorts the data
		//Set <String>list=new HashSet();        //prints randomly
		List list=new ArrayList();        //maintains same sequence
		//Set<String>list=new LinkedHashSet();
		
		list.add("sravani");
		list.add("deepa");
		list.add("lalli");
		list.add("chinni");
		
//		list.add(9.5);
//		list.add(true);
//		list.add(85);	
//		list.add("sravanthi");
//		list.add(9.3);
//		list.add(false);
//		list.add(85);
		
			//System.out.println(list.get(0));            //gets only index
				//System.out.println(list);               //prints whole list
		Collections.sort(list);        
		System.out.println(list);
		
		
		/*for(int i=0;i<list.size();i++)
		{
		System.out.println(list.get(i));                  //prints whole index
		}*/
		
		
//		Iterator itr=list.iterator();                    //loop
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
		
}
}