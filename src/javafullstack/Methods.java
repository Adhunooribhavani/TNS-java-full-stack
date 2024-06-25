package javafullstack;

public class Methods {
	static String display() {
		return "display";//static method
	}
	void display1() {
		System.out.println("diplay1");//instance method
	}
	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.display1();
		System.out.println(Methods.display());
	}

}
