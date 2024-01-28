package assignmentArray;
import java.util.Scanner;
public class Reversenumberelements {

	public static void main(String[] args) {
	
		int n,temp,res,i,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements to reverse");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++,n--) {
			temp=arr[i];
			arr[i]=arr[n-1];
			arr[n-1]=temp;
		}
		System.out.println("reversed elements are:");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
