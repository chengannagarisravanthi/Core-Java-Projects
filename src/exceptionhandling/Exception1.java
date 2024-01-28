package exceptionhandling;

class tryblock extends Exception{
	public tryblock(String msg) {
		super (msg);
	}
}
public class Exception1 {
      int num;
      public void checkNum(int num) throws Exception {
    	  if (num>10) {
    		  tryblock obj1=new tryblock("num is greater than 10");
    		  throw obj1;
    		  }
    	  else {
    		  System.out.println("num shuold be greater than 10");
    	  }
      }
	public static void main(String[] args) {
	
		Exception1 obj1=new Exception1();
		try {
			obj1.checkNum(12);
		}
		catch(Exception e) {
			System.out.println("exception occured :"+e);
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
