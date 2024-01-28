package assignmentArray;

import java.util.Arrays;

public class Sortnumberarray {

	public static void main(String[] args) {
	
		int array[]=new int[] {-2,-3,-1,-5,8,6,9,1};
		System.out.println("before sorting the array elements are:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+"  ");
		}
		Arrays.sort(array);
		
      System.out.println("after sorting the array elements are:"+Arrays.toString(array));
	}

}
