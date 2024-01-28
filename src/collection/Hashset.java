package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset 
{

	public static void main(String[] args)
	{
		Set hashset= new HashSet();
		hashset.add("aman");
		hashset.add("akshatha");
		hashset.add("arman");
		hashset.add("arman");
		hashset.add("aayush");
		System.out.println(hashset);
		Iterator i=hashset.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
//		for(int i=0;i<hashset.size()-3;i++)
//		{
//		System.out.println(hashset);                 
//		}
	}
}

