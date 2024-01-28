package assignmentArray;
import java.util.Scanner;
public class Average 
{

	public static void main(String[] args)
	{
	/*int[]array= {12,15,20,30};
	int length=array.length;
	int sum=0;
	for(int i=0;i<array.length;i++) {
		sum+=array[i];
	}
	double average=sum/length;
	System.out.println("average of an elements  : "+average);*/
	
	
	Scanner sc=new Scanner(System.in);
      System.out.println("enter array elements:");
      int size=sc.nextInt();
      int[]array=new int[size];
      System.out.println("enter array numbers:");
      for(int i=0;i<size;i++) 
      {
    	  int value=sc.nextInt();
    	  array[i]=value;
      }
      int length=array.length;
      int sum=0;
      for(int i=0;i<array.length;i++) 
      {
    	 sum+=array[i];
    	 
      }
      double average=sum/length;
  	System.out.println("average of an elements  : "+average);

	}

}
