package methodoverriding;

public class Derived extends Base{
	public void show() {
		System.out.println("Derived instance show() is called");
		}
	//static method 
	public static void print() {
		System.out.println("Derived static print() is called");
		}
}
