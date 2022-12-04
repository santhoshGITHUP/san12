package THREADS_USING_RUN;

public class ThreadExample {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + ": Displaying...");

		// delegate..

		for (int i = 0; i < 10; i++) {
			Downloader t = new Downloader("image"+(i+1)+".png");
			t.start();// it triggers the run method in the thread
		}
		
		// runnable thread 
		Mango m =new Mango();
		Thread jT= new Thread(m);
		jT.start();
		
		
		System.out.println("Main finished..");
	}
}

class Downloader extends Thread {

	String filename;

	public Downloader(String fileName) {
		filename = fileName;
	}

	@Override
	public void run() {
		super.run();
		// starting point of thread..
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + filename + " Downloading " + i * 10 + "%..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(filename + " Downloaded");
	}

}

class Fruit {
	
}
class Mango extends Fruit implements Runnable{
	 public void makeJuice() {
		 
		 for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + "Preparing juice" + i * 10 + "%..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Juice is ready!!");
	 }

	@Override
	public void run() {
          makeJuice();		
	}
}











