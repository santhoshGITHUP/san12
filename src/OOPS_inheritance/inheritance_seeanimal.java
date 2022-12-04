package OOPS_inheritance;

public class inheritance_seeanimal {
  public static void main(String[] args) {
	    shark shark =new shark();
		//clown clown =new clown();
		shark.name();
		shark.livingplace();
		shark.swim();
		shark.aggressivelevel();
		//clown.name();
		//clown.swim();
		//clown.livingplace();
		//clown.aggressivelevel();
		whiteshark ws=new whiteshark();
		ws.name();
		ws.swim();
		ws.livingplace();
		ws.colour();
		ws.aggressivelevel();
		
}
}
class fish{
	void swim() {
		System.out.println("It can Swim");
	}
	void livingplace() {
		System.out.println("It lives in water");
	}
}
class shark extends fish{
	void name() {
		System.out.println("Shark: ");
	}
	void aggressivelevel() {
		System.out.println("More aggressive");
	}
}
class clown extends fish{
	void name() {
		System.out.println("Clown: ");
	}
	void aggressivelevel() {
		System.out.println("very less aggressive");
	}
}
class whiteshark extends shark{    //multilevel inheritance
	void name() {
		System.out.println("white shark: ");
	}
	public void colour() {
		System.out.println("It is white in colour");
	}
}