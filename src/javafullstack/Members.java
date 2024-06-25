package javafullstack;

public class Members {
	int a = 10;
	static int b=20;
	int display() {
		return 30;
	}
	static int display1() {
		return 40;
	}
	public static void main(String[] args) {
		Members a = new Members();
		System.out.println(a.a);
		System.out.println(a.display());
		System.out.println(Members.b);
		System.out.println(Members.display1());
	}
}
