//Create an ArrayList which will be able to store only numbers 
//like int,float,double,etc, but not any other data type.
package assignmentCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistQ4 {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<>();
		list.add(15);
		list.add(1.2F);
		list.add(3.1415D);
		list.add("Test");
		System.out.println(list);
	
	}

}
