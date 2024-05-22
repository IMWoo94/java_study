package poly.basic;

public class CastingMain6 {
	public static void main(String[] args) {
		// 자바 16 - Pattern Matching for instanceof
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
		if (parent instanceof Child child) {
			System.out.println("Child 인스턴스 맞음");
			child.childMethod();
		}
	}
}
