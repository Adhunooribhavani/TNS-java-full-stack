package javafullstack;

public class DefaultConstructor {
	int number;
	public DefaultConstructor() {
		System.out.println("constructor called");
		number=5;
		}
	public static void main(String[] args) {
		DefaultConstructor obj=new DefaultConstructor();
		System.out.println("Number value:"+obj.number);
		}
}
