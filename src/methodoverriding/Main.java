package methodoverriding;

public class Main {
	public static void main(String[] args) {
		Base p1 = new Derived();
		p1.show();//overriding instance show() of Base by printing executing Derived show()
		Base.print();//here we cannot override the static print() of Base
		Base p2 = new Base();
		p2.show();
		Base.print();
		
	}
}