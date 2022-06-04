package brocode1;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // initialize scanner
		
		System.out.println("what is your name?");
		
		String name = scanner.nextLine(); 	// command for user input
		
		System.out.println("How old are you? ");
		
		int age = scanner.nextInt();
		
		scanner.nextInt(); // used again to clear scanner as nextInt saves \n as enter
		
		System.out.println("What is your favorite food?");
		
		String food = scanner.nextLine();
		
		
		System.out.println("Hello "+name);
		
		System.out.println("You are "+age+" years old");
		
		System.out.println("You like "+food);
		
		
		
		
	}

}
