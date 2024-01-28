package array;

public class Passingarguments {

	public void display(int arr[]) {
		System.out.println("passing arguments here");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public void show(String name[]) {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}
	}

	public static void main(String[] args) {
		int marks[] = { 10, 20, 30, 40, 50 };
		Passingarguments obj = new Passingarguments();
		obj.display(marks); // function call
		System.out.println("----------------------------------");
		String name[] = { "sravani  ", "deepa   " };
		Passingarguments obj1 = new Passingarguments();

		System.out.println("names are displayed here");
		obj.show(name);
		System.out.println("----------------------------------");
		System.out.println("names are combined here ");
		System.out.println(name[0] + name[1] + "are  best  buddies");

	}

}
