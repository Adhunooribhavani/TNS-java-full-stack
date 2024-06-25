package javafullstack;

public class overloading {
	public void hello() {
		System.out.println("hello");// same method with no parameter
	}
	public void hello(String a) {
		System.out.println("hello()"+ a +" is called");// same mathod with parameter
	}
	public static void main(String[] args) {
		overloading t = new overloading();
		t.hello();//calling instance method without parameter
		t.hello("bhavani");//calling instance mathod without parameter
	}
}
