import java.util.Scanner;
public class ProceduralProgramming {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name:");

	 String name=scan.nextLine();
	name= name.toUpperCase();
	System.out.print("Hi, my name is "+ name);
}
}
