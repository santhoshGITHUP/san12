package STRING;

public class String_functions {

	public static void main(String[] args) {

		String message = "Hello World";

		System.out.println(message.length());    //over all length of letter include with space..
		System.out.println(message.charAt(0));   
		System.out.println(message.indexOf("H"));

		System.out.println(message.startsWith("Hell"));
		System.out.println(message.endsWith("ld"));
		System.out.println(message.contains("llo"));

		System.out.println(message.concat(",This is java string"));
		System.out.println("Santhosh".compareTo("Senthil")); // this case is , 1st letter is same so second letter will be  compare.

		System.out.println(message.substring(5));
		System.out.println(message.substring(2, 7));

	}
}
 