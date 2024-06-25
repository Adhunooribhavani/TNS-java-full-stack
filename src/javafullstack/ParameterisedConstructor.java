package javafullstack;

public class ParameterisedConstructor {
	int number;
	public ParameterisedConstructor(int x) {
		System.out.println("parameterised constructor called");
		number=x;
	}
	public static void main(String[] args) {
		ParameterisedConstructor obj = new ParameterisedConstructor(7);
		System.out.println("Number value is:"+obj.number);
		}
}
