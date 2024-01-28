package assignmentCollection;
import java.util.ArrayList;
	import java.util.LinkedList;
    import java.util.Vector;

	        public class VectorQ1 
	        {
				Vector<Integer> list = new Vector<Integer>();
				
				 Vector<Integer> saveEvenNumbers(int N)
				 {
	              list = new Vector<Integer>();
					for (int i = 2; i <= N; i++) 
					{
						if (i % 2 == 0) list.add(i);
					}
					
					return list;
				}
				public Vector<Integer> printEvenNumbers() 
				{
					Vector<Integer> newList = new Vector<Integer>();
				
					for (int item : list) 
					{
						newList.add(item * 2);
						System.out.println(item * 2);
					}
					
					return newList;
				}

				public static void main(String[] args) 
				{
					VectorQ1 a = new VectorQ1();
					a.saveEvenNumbers(10);
					a.printEvenNumbers();
				}

			}

