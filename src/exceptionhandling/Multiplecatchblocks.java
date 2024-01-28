package exceptionhandling;

public class Multiplecatchblocks {

	public static void main(String[] args) {
	     try {
	    	 int arr[]= {1,2,3,4,5,6};
	    	//arr[4]=5/0;
	    	/* String a=null;
	    	 System.out.println(a.charAt(0));
	    	 it is a null pointer exception-----it will give here other exception as output */
	    	 System.out.println("arr[4]:"+arr[4]);
	    	 System.out.println("arr[10]:"+arr[10]);
	    	 //arr[10] value is not declared
	     }
	     catch(ArithmeticException e)
	     {
	         System.out.println(" should not divide a number by zero");
	         //in try block if we declare arr[4]/0---- it will gives this as output
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("exceeds the limit of array elements");
	         //in try block arr[10] is not declared------so,it will print this as output
	      }
	      catch(Exception e){
	         System.out.println("Other Exception");
	         //it will print if there are any other exceptions
	      }
	     finally
	      {
	    	  System.out.println("multiple catch blocks");
	      }

	}

}
