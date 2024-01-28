package Inheritance;
interface Backend{
	public void server();
}
class Frontend{
	public void client (String str) {
		System.out.println(str+"frontend");
	}
}
class Multiple extends Frontend implements Backend{
	
	String Multiple="java";
public void client() {
	System.out.println(Multiple+"backend");
}
	public static void main(String[] args) {
		Multiple java=new Multiple();
		java.server();
		java.client(java.Multiple);

	}
	@Override
	public void server() {
		System.out.println("java is a frontend language");
	}

}
