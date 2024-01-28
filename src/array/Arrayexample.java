package array;

import java.util.*;

public class Arrayexample {

	public static void main(String[] args) {
		int num[] = new int[7];

		Scanner sc = new Scanner(System.in);
		System.out.println("how many students are there");
		int n = sc.nextInt();
		int marks[] = new int[n];

		System.out.println("enter the  name  of each student");
		String[] Name = new String[n];
		for (int i = 0; i < n; i++) {
			Name[i] = sc.next();

		}
		System.out.println("students are:");
		for (int i = 0; i < n; i++) {
			System.out.println(Name[i]);
		}

		System.out.println("enter the marks of each student");
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("marks are:");
		for (int i = 0; i < n; i++) {
			System.out.println(num[i]);
		}
	}
}
