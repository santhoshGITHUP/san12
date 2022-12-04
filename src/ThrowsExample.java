import java.io.File;
import java.io.IOException;

public class ThrowsExample {

	static boolean isScreenOn = false;

	public static void main(String[] args) {

		try {
			display();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			display();
			touchButton();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File f=new File("");
		try {
			f.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void display() throws Exception {
			if (!isScreenOn) {
				throw new Exception("Screen is not present..");
			}
			System.out.println("displaying..");
		
	}
	public static void touchButton() {
		
	}
}
