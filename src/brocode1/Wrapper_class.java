package brocode1;

public class Wrapper_class {

	public static void main(String[] args) {
		
		/* Wrapper class = provides a way to use primitive data types as reference data types
		 * reference data types constain useful methods
		 * can be used with collections(ex. ArrayList) 
		 * 
		 * Primitive	//wrapper
		 * ---------	//--------
		 * boolean		Boolean
		 * char			Character
		 * int			Integer
		 * double 		Double
		 * 
		 * autoboxing = the automatic conversion that the Java compiler makes betwn the primitive types and their corresponding obj wrapper class
		 * unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		 */
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bro";
		
		System.out.println(c.intValue());
		
		if(a==true) {
			System.out.println("This is true");
		
		}
		
		
		
		
	}

}
