package HashMap_HashSet;

import java.util.HashMap;

public class Practice_HashMap {

	public static void main(String[] args) {

		HashMap<String, String> Hometown = new HashMap<String, String>();
		Hometown.put("Soniah", "Sylhet");
		Hometown.put("Habib", "Dhaka");
		Hometown.put("Mahmud", "Barishal");
		Hometown.put("Patwary", "Noakhali");
	
		System.out.println("Hometown: "+ Hometown.get("Mahmud"));
			
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		StudentAge.put("Soniah", 25);
		StudentAge.put("Habib", 38);
		StudentAge.put("Mahmud", 28);
		StudentAge.put("Patwary", 45);
		
	System.out.println("StudentAge: "+ StudentAge.get("Mahmud"));

	}

}
