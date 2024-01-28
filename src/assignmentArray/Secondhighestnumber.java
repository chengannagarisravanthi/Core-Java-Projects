package assignmentArray;

import java.util.Arrays;

public class Secondhighestnumber {

	public static void main(String[] args) {
		int array[]= {12,43,56,21,83,35};
		int size=array.length;
		Arrays.sort(array);
		System.out.println("sorted array :"+Arrays.toString(array));
		int res=array[size-2];
		System.out.println("2nd largest number is :"+res);
		int result=array[size-3];
		System.out.println("3rd largest number is :"+result);
		

	}

}
