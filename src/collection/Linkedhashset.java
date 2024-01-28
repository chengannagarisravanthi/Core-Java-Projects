package collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedhashset 
{

	public static void main(String[] args) 
	{
		
		//LinkedHashSet<String> l = new LinkedHashSet<String>();
		LinkedList<String> l=new LinkedList<String>();
		l.add(new String("sravani"));
		l.add("1");
		l.add(new String("mayuri"));
		l.add("2");
		l.add(new String("sathya"));
		l.add("3");
		l.add(new String("jwala"));
		l.add("3");;
		l.add(new String("shailu"));
		l.add("4");
		l.add(new String("sathya"));
		l.add("5");
		;
		Object array[] = l.toArray( );
		for(int i=0; i<12; i++) 
		{
		 System.out.println(array[i]);
		}
	}
}

