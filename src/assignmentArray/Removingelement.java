package assignmentArray;

import java.util.Arrays;

public class Removingelement {

	public static void main(String[] args) {
		int arr[]= {12,13,14,15,16};
		System.out.println("before removing element:"+Arrays.toString(arr));
		
		int removeelement=2;
		for(int i=removeelement;i<arr.length;i++) {
			arr[i]=arr[i]+1;
		}
		System.out.println("after removing an element:"+Arrays.toString(arr));
	}

}
