package THREADS_USING_JOIN_FUNCTION;

public class Join_function {
     public static void main(String[] args) {
    	 downloading d= new downloading(); 
    	 lisenceapply l= new lisenceapply();
    	 d.start();
    	 try {
			d.join(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	 l.start();
	}
}
class lisenceapply extends Thread {
	   @Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100*1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				//System.out.println("downloading...");
			}
			System.out.println("lincess apply...");
		}
	}
}
	 
   class downloading extends Thread {
	   @Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100*1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				//System.out.println("downloading...");
			}
			System.out.println("downloading...");
		}
	}
   }
	 