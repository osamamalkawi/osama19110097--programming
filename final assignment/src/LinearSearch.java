import java.util.Scanner;
public class LinearSearch {
	
	static int pointer = -1;
	
public static void linearSearch() {
	
		int array[];
		array= new int[] {10, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number:");
		 int num= scan.nextInt();
		
		for (int i=0;i<=9;i++) {
			
		if (num==array[i]) {
			System.out.println("the number is in element no."+i);
			pointer=i;
			break;}
		}
		
		if (pointer == -1) {
			//run = false;
			System.out.println("the number was not found.");
		}
	}
	


public static void main(String [] args) {
	 linearSearch();
	 
	while (pointer == -1) {
		linearSearch();
	}
}
}
