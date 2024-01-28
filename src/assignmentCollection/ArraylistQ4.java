//Create an ArrayList which will be able to store only numbers 
//like int,float,double,etc, but not any other data type.


package assignmentCollection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
	
		
	
		class MyArrayList<E> extends ArrayList<E> {
			@Override
			public boolean add(E e) {
				if (e instanceof Integer || e instanceof Float || e instanceof Double ) {
					super.add(e);
					return true;
				} else {
					throw new ClassCastException("Only Integer, Float, and Double are supported.");
				}
			}
		}

		public class ArraylistQ4   {
			public static void main(String[] args) {
				//List<Object> list = new MyArrayList<>();
				//Vector<Object> list = new Vector<>();
				LinkedList<Object>list=new LinkedList<>();
				try {
					list.add(15);
					list.add(1.2F);
					list.add(3.1415D);
					list.add(5.234);
					list.add(3.22F);
					list.remove(3.22F);
					} 
				catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(list);

			}

}
  
	
//	
//public class ArraylistQ4   {
//
//		public static void main(String[] args) {
//			ArrayList<Object> list = new ArrayList<>();
//			list.add(15);
//			list.add(1.2F);
//			list.add(3.1415D);
//			list.add("Test");
//			System.out.println(list);
//		}
//}	
