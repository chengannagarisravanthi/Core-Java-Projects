package assignmentArray;

public class Findingspecificvalue {

	public static void main(String[] args) {
		int num[]= {4,7,2,9,3};
		int findnumber=9;
		boolean arraynum=false;
		for(int n:num) {
			if(n==findnumber) {
				arraynum=true;
				break;
			}
		}
		if(arraynum) {
			System.out.println(findnumber+"is in the given array");
		}
		else {
			System.out.println(findnumber+"is not present in the given array");
		}

	}

}
