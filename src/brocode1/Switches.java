package brocode1;

public class Switches {

	public static void main(String[] args) {
		
		// Switch is a statement that allows a variables to be tested for equality against a list of values
		
		String day = "hamburger";
		
		switch(day) {
		case "Sunday": System.out.println("It is Sunday");
		break;
		case "Monday": System.out.println("It is Monday");
		break;
		case "Tuesday": System.out.println("It is Tuesday");
		break;
		case "Wednesday": System.out.println("It is Wednesday");
		break;
		case "Thursday": System.out.println("It is Thursday");
		break;
		case "Friday": System.out.println("It is Fridayday");
		break;
		case "Saturday": System.out.println("It is Saturday");
		default: System.out.println("That is not a day");
		
			
		}

	}

}
