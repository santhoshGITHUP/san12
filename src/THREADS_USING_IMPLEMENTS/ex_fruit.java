package THREADS_USING_IMPLEMENTS;

public class ex_fruit {
    public static void main(String[] args) {
    	  startcount sc = new startcount();
		  sc.start();
		  apple ap =new apple();
		  Thread juiceT =new Thread(ap);
		  juiceT.start();
		  System.out.println(Thread.currentThread().getName());
		
		  for(int i=1;i<10;i++) {
			  try {
				Thread.sleep(100*12);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  
			  System.out.println(i);
		  }
		  
    System.out.println("program start now...");
	}
}
class startcount extends Thread {
	@Override
	public void run() {
		super.run();
		 for(int i=1;i<10;i++) {
			  try {
				Thread.sleep(100*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  System.out.println(Thread.currentThread().getName()+ " "+i);
		  }
	}
}
  class fruit {
	  
  }
  class apple extends fruit implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			  try {
				Thread.sleep(100*6);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  System.out.println("making apple juice...");
		  }
		System.out.println("apple juice is ready");
		
	}
	  
  }