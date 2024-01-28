package controlstatement;

import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		 number= sc.nextInt();
		if(number<=70)
		{
			System.out.println("average student");
		}
		else
		{
			System.out.println("brilliant");
		}
	}

}
