package OOPS;

public class ex2_smartphone_driver {
public static void main(String[] args) {
	ex2_smartphone p = new ex2_smartphone();
	p.displaySize = 5.7f;
	p.modelName ="Samsung";
	p.price = 25000.0f;
	p.ram = 8;
	p.rom = 128;
	p.displayDeviceInfo();
	p.call();
	

}
}