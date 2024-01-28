package Constructors;
class Student{
	int rollno;
	String name;
	static String stuname="sravani";
	public static void bit() {
		stuname="chengannagari";
	}
	Student (int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno +" "+name+" "+stuname);
	}
}
public class Static {

	public static void main(String[] args) {
		Student.bit();
		Student s1=new Student(1,"sravani");
		Student s2=new Student(2,"sravanthi");
		Student s3=new Student(3,"prasad");
		Student s4=new Student(4,"rajeswari");
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		
		
	}

}