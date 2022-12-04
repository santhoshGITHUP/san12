package THREADS_USING_RUN;

public class BackGround_condition {
    public static void main(String[] args) {
    	DoTask t = new DoTask();
    	t.start();
    	System.out.println(Thread.currentThread().getName());
    	try {
			Thread.sleep(100*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("program end ...");
	}
}
    class DoTask extends Thread {   // using run methods
    	  @Override
    	public void run() {  // below run conditon using due back ground thread run.
    		super.run();
    		for(int i=0;i<10;i++) {
    			try {
    				Thread.sleep(100*4);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    			System.out.println(Thread.currentThread().getName() + " " +i);
    			
    		}
	}
}
