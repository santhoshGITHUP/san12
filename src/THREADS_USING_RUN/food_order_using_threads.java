package THREADS_USING_RUN;

import java.util.Scanner;

public class food_order_using_threads {
    public static void main(String[] args) {
    	Scanner get = new Scanner(System.in);
		String[] nameList= {"Ram","Sam","Mam"};
		for(int i=0;i<nameList.length;i++) {
		System.out.println("Welcome "+nameList[i]);
		System.out.println("Please select your food 1.Pizza 2.Burger 3.Dosa");
		int order=get.nextInt();
		if(order==1) {
			System.out.println("Thank you "+nameList[i]+" for selecting our cafe please wait for your Pizza");
			Pizza p = new Pizza();
			p.start();
		}
		if(order==2){
			System.out.println("Thank you "+nameList[i]+" for selecting our cafe please wait for your Burger");
			Burger b= new Burger();
			b.start();
		}
		if(order==3){
			System.out.println("Thank you "+nameList[i]+" for selecting our cafe please wait for your Dosa");
			Dosa d=new Dosa();
			d.start();
			
		}
		}
	}

}
class Pizza extends Thread{
	public void run() {
		for(int i=0;i<=100;i=i+10) {
			System.out.println("Pizza is preparing "+i+"%");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Pizza is ready");
	}
	
}
class Burger extends Thread{
	public void run() {
		for(int i=0;i<=100;i=i+10) {
			System.out.println("Burger is preparing "+i+"%");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Burger is ready");
	}
	
}
class Dosa extends Thread{
	public void run() {
		for(int i=0;i<=100;i=i+10) {
			System.out.println("Dosa is preparing "+i+"%");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Dosa is ready");
			}
    }                                                                     
	
    
    

