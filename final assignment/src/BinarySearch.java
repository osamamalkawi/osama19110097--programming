
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
	static int ubound;
	static int lbound;
	 public static void binarySearch(){  
		 System.out.println("enter the search value:");
			Scanner scan = new Scanner(System.in);
			int num= scan.nextInt();   
		    int array[] = {1,2,3,4,5,6,7,8,9,10,11};
		    Arrays.sort(array);
	         ubound=array.length-1; 
	         lbound=0;
	        int mid = (lbound + ubound)/2; 
	        
			   while( lbound <= ubound ){  
			       if ( array[mid] == num ){  
			        System.out.println("Element is found at index: " + mid);  
			        break;  
			      }else if ( array[mid] < num ){  
			        lbound = mid + 1;     
			      }else{  
			         ubound= mid - 1;  
			      }  
			      mid = (lbound + ubound)/2;  
			   }  
			   if ( lbound > ubound ){  
			      System.out.println("Element is not found!");  
			   }  
			 }  
	 
	 public static void main(String [] args) {
		 binarySearch();
		 while(lbound > ubound) {
			 binarySearch();
		 }
	 }
	        
	 } 
	 