package brocode1;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// while loop = executes a block of code as long as the conditions are true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
			
		}
		System.out.println("Hello "+name);
	}

}
