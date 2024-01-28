package array;
import java.util.*;

public class Usingvariable {

	public static void main(String[] args) {
		int marks[]= {30,40,50};
		
		System.out.println("marks[0]:"+marks[0]);
		System.out.println("marks[1]:"+marks[1]);
		System.out.println("marks[2]:"+marks[2]);
		int mean = marks[0]+marks[0]/2;
		
		System.out.println("mean:"+mean);
		System.out.println("---------------------------------");
		int i;
		for(i=0;i<=2;i++) {
		System.out.println("marks["+i+"]="+marks[i]);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("enter names");
		String name[]= {"sravani ","deepa  "};
		System.out.println("name[0]:"+name[0]);
		System.out.println("name[1]:"+name[1]);
		System.out.println(name[0] + name[1] + "are best buddies");
		}
		
	}

