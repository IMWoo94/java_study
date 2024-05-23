package lang.object;

// 이미 Object 클래스가 아닌 다른 클래스를 상속 받은 경우 Object 클래스를 직접적으로 상속받지 않는다.
// 이유는 이미 부모 클래스에서 Object 가 상속받았기 때문에 자식 클래스 또한 Object 의 기능을 상속받아 사용이 가능하다.
public class Child extends Parent {
	public void childMethod() {
		System.out.println("Child.childMethod");
	}
}
