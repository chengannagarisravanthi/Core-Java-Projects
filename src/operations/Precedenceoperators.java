package operations;

public class Precedenceoperators {

	public static void main(String[] args) {
		 int a=5,b=12,c=8,d=10,cal;
		 //cal=a+(b*d)/c;
		 //5+(12*10)/8
		// 5+120/8
		 //5+15
		 //20
		cal=d++*2+(++c)/a;
		 System.out.println(cal);

	}

}
