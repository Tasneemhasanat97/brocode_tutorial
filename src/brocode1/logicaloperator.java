package brocode1;

public class logicaloperator {

	public static void main(String[] args) {
		//logical operators = used to connect two or more expressions
		//  
		// &&  = AND  where both conditions are true
		// ||  = OR   where either conditions are true
		//  !  = NOT  reverses boolean value of condition
		
		int temp = 25;
		
		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30){
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		
		}
		
		
		
		
	}

}
