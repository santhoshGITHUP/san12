package OOPS;

public class ex2_smartphone {
	String modelName;
	float price;
	int ram;
	int rom;
	float displaySize;
	String processor;

	public void switchOn() {
		System.out.println("Phone booted..");
	}
	public void switchOff() {
		System.out.println("Phone switched off..");
	}
	public void reStart() {
		
	}
	public void call() {
		System.out.println("Calling ...");
	}
	public void installApp() {
		System.out.println("Installing apps...");
	}
	public void unInstallApp() {
		
	}
	public void displayDeviceInfo() {
		System.out.println("Details:-");
		System.out.println("Name : "+modelName);
		System.out.println("Size : "+displaySize);
		System.out.println("Ram  : "+ram);
		System.out.println("Rom  : "+rom);
}
}
