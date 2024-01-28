package array;

public class Twodimstring {

	public static void main(String[] args) {
	String name[][]=new String[2][2];
	   name[0][0]="sravani";
	   name[0][1]="sravanthi";
	   
	   name[1][0]="deepa";
	   name[1][1]="sravani";
	   
	   for(int i=0;i<name.length;i++) {
		   for(int j=0;j<name.length;j++) {
			   System.out.print(name[i][j]+" ");
		   }
		   System.out.println("\n");
	   }
		//int [ ] x=new int[10];
		//System.out.println(x[4]);
		//int x[ ][ ]=new int[10] [ ];
		//System.out.println(x[4][0]);
		}
	
	}

