package operations;

public class logicaloperations {

	public static void main(String[] args) {
		boolean x=true;
		boolean y=false;
		System.out.println("x&&y is"+(x&&y));
		System.out.println("x||y is"+(x||y));
		System.out.println("!x is"+(!x));
		System.out.println("!(x&&y)"+!(x&&y));
		
		int a=10;
		int b=20;
		int c=30;
		
		if((a<b)&&(c>a))
		{
			System.out.println("((a<b)&&(c>a)) is"+((a<b)&&(c>a)));
			System.out.println("c is the greatest value");
		}
		

	}

}
