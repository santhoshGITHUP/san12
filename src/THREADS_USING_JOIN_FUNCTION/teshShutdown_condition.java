package THREADS_USING_JOIN_FUNCTION;

import java.util.Random;
   class MyThread1 extends Thread {
	  int flag=0;
	  public void run() {
		  if(flag==1) {
			System.out.println("doenload sucess");  
		  } else {
			  System.out.println("download failed....");
		  }
	  }
	 
   }
public class teshShutdown_condition {
    public static void main(String[] args) {
		   MyThread1 mt = new MyThread1();
		   mt.flag=0;
		   Runtime r = Runtime.getRuntime();
		   r.addShutdownHook(mt);
		   System.out.println("now main sleeping...press ctrl+c to exit");
		   try {
		   for(int i=0;i<=10;i++) {
			   Thread.sleep(1000+new Random().nextInt(6000));
			   System.out.println(i);
			   if(i==5) {
				   int k= i/9;
			   }
		   }
		   
		   mt.flag=1;
		   }catch(InterruptedException e) {
			   
		   }
}
}