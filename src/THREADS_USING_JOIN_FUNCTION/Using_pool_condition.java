package THREADS_USING_JOIN_FUNCTION;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Using_pool_condition {
  public static void main(String[] args) {
	  ExecutorService executor = Executors.newFixedThreadPool(10);
	  for(int i=0;i<100;i++) {
	  loader g = new loader();
	  executor.execute(g);
	  }
		  
	}
	}
	  class loader extends Thread {
		  @Override
		public void run() {
			super.run();
			for(int i =0;i<10;i++) {
				try {
					Thread.sleep(100*1);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
				System.out.println(Thread.currentThread().getName()+" loader");
			}
}
}
   