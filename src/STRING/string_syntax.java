package STRING;

public class string_syntax {

	public static void main(String[] args) {

		String name = "Hello World";
		String name2 = "Hello World";

		String message = new String("This is Java program");
		String message2 = new String("This is Java program");

		System.out.println(name == name2);
		System.out.println(message == message2);// checks reference

		System.out.println(name.equals(name2));// checks content
	}
}

