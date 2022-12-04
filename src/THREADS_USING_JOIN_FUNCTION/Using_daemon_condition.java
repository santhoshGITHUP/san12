package THREADS_USING_JOIN_FUNCTION;

public class Using_daemon_condition {
   public static void main(String[] args) {
	   graphicloader g = new graphicloader();
	 //  g.setDaemon(true);
	   g.setDaemon(false);
	   g.start();
	  // g.setName("santhosh");
	   try {
		g.sleep(100*3);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   int n =7/0;   // error 
}
}
  class graphicloader extends Thread {
	  @Override
	public void run() {
		super.run();
		for(int i =0;i<10;i++) {
			try {
				Thread.sleep(100*1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println(Thread.currentThread().getName()+"graphic loader");
		}
	}
  }