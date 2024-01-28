package Constructors;
class Data {

	        // created a public static variable 
	  private static Data language;

	             // private constructor
	  private Data() {
	    System.out.println("you have 1.5GB data per day");
	  }

	           // public static method
	  public  static Data show() {
		  if(language == null) {
		        language = new Data();
		  }
		  return language;       //return method
	  }
	  public void display() {
	      System.out.println("you used 50% data today");
	  }
	}

	class Private {

	public static void main(String[] args) {
	     Data d;
		d=Data.show();
		

	     // call the display method
	     d.display();
	  }
	}