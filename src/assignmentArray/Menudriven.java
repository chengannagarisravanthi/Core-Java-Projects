package assignmentArray;
import java.util.Scanner;
public class Menudriven {



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to menudriven code:");
		
		while(true) {
		
		System.out.println("1.accept the array elements");
		System.out.println("2.display the array elements");
		System.out.println("3.search the array elements");
		System.out.println("4.sort the array using elements");
		System.out.println("5.to exit");
		System.out.println("enter your choice:::");
		int choice = sc.nextInt();
	
		switch(choice){
		case 1:
			
			 int n;    //Declare array size
		      System.out.println("Enter the total number of elements ");
		      n=sc.nextInt();     //Initialize array size

		      int arr[]=new int[n];   //Declare the array
		      System.out.println("Enter the elements of the array ");
		      for(int i=0; i<n ;i++)     //Initialize the array
		      {
		          arr[i]=sc.nextInt();
		      }
		      
		case 2:
			 int [] arr1 = new int [] {1, 2, 3, 4, 5};  
		        System.out.println("Elements of given array: ");  
		        
		        for (int i = 0; i < arr1.length; i++) {  
		            System.out.print(arr1[i] + " ");  
		        }  
		        System.out.println( );
		case 3:
			 int i,n1,search,flag=0;
			 System.out.println("Enter the number of elements:") ;
			 n = sc.nextInt();
			 int[] a = new int[n];
			 
			     System.out.println("Enter the elements") ;
			     for(i=0;i<n;i++)
			     {
			         a[i] = sc.nextInt();
			     }
			 
			 System.out.println("Enter the element to be seached");
			 search = sc.nextInt();
			    
			    
			     for(i=0;i<n;i++)
			     {
			         if(a[i]==search)
			         {
			             System.out.println("Element "+search+" found at "+i+" position");
			             flag=1;
			             break;
			         }
			     }
			     if(flag==0)
			     {
			         System.out.println("Element "+search+" not found");
			     }
			     
		
        }  

		
		}

	}

}

