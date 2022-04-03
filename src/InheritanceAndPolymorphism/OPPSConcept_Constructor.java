package InheritanceAndPolymorphism;

public class OPPSConcept_Constructor {
		
//Constructor: A method which is published before the main method. 
//It is a method same as a class name, execute first and create instance of class. 
		
		String admin;
		public OPPSConcept_Constructor(String name) {
		admin = name;
		}
		public static void main(String[] args) {
		
			OPPSConcept_Constructor MondayGroup = new OPPSConcept_Constructor("Habib");
System.out.println("MondayGroup admin: " + MondayGroup.admin);

           OPPSConcept_Constructor TuesdayGroup = new OPPSConcept_Constructor ("Mahmud");
System.out.println("TuesdayGroup admin: " + TuesdayGroup.admin);
	}
		public void mymethod(int age) {
			System.out.println(age);
		}

}
