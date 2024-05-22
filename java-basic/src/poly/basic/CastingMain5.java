package poly.basic;

public class CastingMain5 {
	public static void main(String[] args) {
		// 부모 자식 클래스의 상속 관계에 대해서 다형성에 의해서 어떤 인스턴스를 참조하고 있는지 확인하기 어렵다는 생각이 든다.
		// 이를 확인하기 위해서 instanceof 라는 키워드를 통해서 참조하는 인스턴스를 알 수 있다.

		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);

		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);

		Child child1 = new Child();
		Parent parent3 = child1;
		System.out.println("parent3 호출");
		call(parent3);

	}

	private static void call(Parent parent) {
		parent.parentMethod();
		// parent 라는 변수가 Child 의 인스턴스를 가지고 있는지 확인한다.
		if (parent instanceof Child) {
			System.out.println("Child 인스턴스 맞음");
			Child child = (Child)parent;
			child.childMethod();
		}
	}
}
