package EXCEPTION_HANDLING;

public class arithmatic_condition {
  public static void main(String[] args) {
		/*
		 * Throwable - > Exception - > Error Exception -
		 * Arithmetic,ArrayIndexOut,StringIndexOut Nullpointer,ClassCasting,etc.. Error
		 * -> StackOverflow error,OutofMemory error
		 * 
		 * 
		 * try,catch,finally,throw throws
		 */
		int i = 9;
		int j = 3;
		int ar[] = { 4, 5, 2, 5 };
		String name= "santhosh";
		try {
			try {
				System.out.println("Mul = " + (i * j));
				int k = i / j;
				System.out.println("Div = " + k);
			}catch (ArithmeticException e) {
				// e.printStackTrace();
				System.err.println("error : " + e.getMessage());
			}
			
			System.out.println("Index of : " + ar[3]);
			System.out.println("length of the name is :" +name.length());
			System.out.println("char at :"  +name.charAt(4));
		 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("error: " + e.getLocalizedMessage());
		} catch(StringIndexOutOfBoundsException e) {
			System.err.println("ERROR :" + e.getLocalizedMessage());
		}  finally {
			System.out.println("always execute...");
		}

		System.out.println("Program ends..");

	}

	public static void callM() {
		System.out.println("Calling..");
		callM();
	}
}

