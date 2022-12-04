package THREADS_USING_RUN;

public class pratice {
   public static void main(String[] args) {
	     examstart x = new examstart();
	     x.start();
	     bhaguplimovie ap= new bhaguplimovie ();
	     Thread tmovie= new Thread(ap);
	     tmovie.start();
	     for(int i=0; i<10;i++) {
	    	 try {
				Thread.sleep(100*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	 System.out.println(i);
	    	 System.out.println("first program start...");
	    	 System.out.println("program completed");
	     }
	   
	   
   }
   }
  class examstart extends Thread{
	  @Override
	public void run() {
		super.run();
		for(int i=0; i<10;i++) {
	    	 try {
				Thread.sleep(100*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	 System.out.println(i);
	    	 System.out.println("exam start now ...");
	    	 System.out.println("exam completed");
	     }
	}
  }
   class thater {
	   
   }
  class bhaguplimovie extends thater implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
	    	 try {
				Thread.sleep(100*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	 System.out.println(i);
	    	 System.out.println("movie start now ...");
	    	 System.out.println("movie  completed");
	     }
	}
	  
  }