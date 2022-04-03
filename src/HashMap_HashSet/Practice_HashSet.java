package HashMap_HashSet;

import java.util.HashSet;

public class Practice_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> Car = new HashSet<String>();
		Car.add("Toyota");
		Car.add("BMW");
		Car.add("Audi");
	
	System.out.println("Hashset Value: "+ Car);
	System.out.println("Hashset Value: "+ Car.size());
	
	Car.remove("Toyota");
	System.out.println("Hashset value remove: "+ Car);
	
	
	Car.clear();
	System.out.println(Car);
	}

	}
