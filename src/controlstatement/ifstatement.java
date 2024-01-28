package controlstatement;
import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		 number= sc.nextInt();
		if(number<50)
		{
			System.out.println("the number of students is less tan 50");
		}
	}

}
