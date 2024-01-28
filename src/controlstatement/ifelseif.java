package controlstatement;
import java.util.Scanner;
public class ifelseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a month");
		int month=sc.nextInt();
		if( month==1) {
			System.out.println("january-it's winterseson");
		}
		else if(month==2) {
			System.out.println("february-it's a winter season");
		}
		else if(month==3)
		{
			System.out.println("march-it's a summer season");
		}
		else if(month==4)
		{
			System.out.println("april-it's a summer season");
		}
		else if(month==5)
		{
			System.out.println("may-it's a summer season");
		}
		else if(month==6)
		{
			System.out.println("june-it's a autumn season");
		}
		else if(month==7)
		{
			System.out.println("july-it's a autumn season");
		}
		else if(month==8)
		{
			System.out.println("august-it's a autumn season");
		}
		else if(month==9)
		{
			System.out.println("september-it's a rainy season");
		}
		else if(month==10)
		{
			System.out.println("october-it's a rainy season");
		}
		else if(month==11)
		{
			System.out.println("november-it's a rainy season");
		}
		else if(month==12)
		{
			System.out.println("december-it's winter season");
		}
		else {
			System.out.println("wrong input");
	     }

	}

}
