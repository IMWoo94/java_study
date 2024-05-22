package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
	@Override
	public void methodA() {
		System.out.println("Child.methodA");
	}

	/**
	 * methodCommon 의 경우 InterfaceA, InterfaceB 둘다 포함되어 있다.
	 * 일반적인 상속의 경우 Java 는 하나의 상속만 허용하는데 이러한 문제로 인해서 상속을 하나만 제공한다.
	 * 만약 InterfaceA, InterfaceB 가 둘다 클래스 였다면, 자식 클래스에서 methodCommon 을 호출하게 되면
	 * 두개의 클래스 중에 어떤 메소드를 선택해야 할지 알수가 없다.
	 *
	 * 인터페이스를 통한 구현도 상속과 동일하게 찾아야하는데 왜 가능한 것인가하면,
	 * 인터페이스에서는 부모 클래스의 메소드를 사용하는 것이 아닌 전적으로 자식 클래스에 해당 메소드에 대한 책임을 100% 으로 넘기기 때문이다.
	 * 즉, 자식클래스에서 정의한 내용만 사용할 수 있기 때문에 선택적인 문제가 없어지는것이다.
	 */
	@Override
	public void methodCommon() {
		System.out.println("Child.methodCommon");
	}

	@Override
	public void methodB() {
		System.out.println("Child.methodB");
	}
}
