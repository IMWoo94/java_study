package extends1.ex2;

public class Car {
	public Car() {
		System.out.println("constructor called");
	}

	public void move() {
		System.out.println("차를 이동합니다.");
	}

	private void privateMethod() {
		System.out.println("private method");
	}

	public final void finalMethod() {
		System.out.println("final method");
	}

	public static void staticMethod() {
		System.out.println("static method");
	}
}
