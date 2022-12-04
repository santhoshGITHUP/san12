package THREADS_USING_RUN;

public class basic_threads {
    public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100*4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
		System.out.println("program end ...");
	}
}
    