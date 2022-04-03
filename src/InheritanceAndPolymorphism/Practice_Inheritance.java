package InheritanceAndPolymorphism;

public class Practice_Inheritance {

	public static void main(String[] args) {
		
String username = "raselalam";
String password = "123456";

Login(username, password);
	}

	protected static void Login(String username, String password) {
		System.out.println("username: "+ username);
		System.out.println("password: "+ password);
		
	}

}
