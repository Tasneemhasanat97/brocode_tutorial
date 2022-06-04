package brocode1;

import java.util.Scanner;

public class mathclass {
	public static void main(String [] args) {
	
	

		// Math.sqrt(y) sqrt function
		// Math.round(x) round to nearest number
		// Math.ceil(x) round up
		// Math.floor(x) round down
		
	double x;
	double y;
	double z;
	
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter side x: ");
	x = scanner.nextDouble();
	System.out.println("Enter side : ");
	y = scanner.nextDouble();	
	
	z = Math.sqrt((x*x)+(y*y));
		
	System.out.println("The hypotenus is : "+z);
	
	scanner.close();
	
	
	}
	
}