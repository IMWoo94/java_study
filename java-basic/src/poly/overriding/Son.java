package poly.overriding;

public class Son extends Child {
	public String value = "son";

	@Override
	public void method() {
		System.out.println("Son.childMethod");
	}
}
