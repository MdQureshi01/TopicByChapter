package arrays_collections;

import java.util.Arrays;

public class Printing_CopyAnArrays {

	public static void main(String[] args) {
			
			String[] cars = {"Honda", "Toyota", "BMW", "FORD"};
			
			String[] copy = new String[4]; // [][][][]
			
			
			for(int i = 0; i<cars.length; i++ ) {
				copy[i] = cars[i]; 
				System.out.println(Arrays.toString(copy));
			}		

	}

}
