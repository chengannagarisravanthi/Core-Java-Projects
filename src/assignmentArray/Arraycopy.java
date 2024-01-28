package assignmentArray;

public class Arraycopy {

	public static void main(String[] args) {
		int[]source= {111,222,333};
		int[]dest=new int[3];
		//String [] source= {"sravani","deepa"};
		//String[]dest=new String[3];
		System.arraycopy(source, 0, dest, 0,source.length);
		for(int i=0;i<dest.length;i++) {
			System.out.println("element at index"+i+":"+dest[i]);
		}

	}

}