package poly.basic;

public class CastingMain4 {
	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child)parent1;
		child1.childMethod(); // 다운 캐스팅 시 문제 없음

		/**
		 * 주어진 다운캐스팅을 잘못사용하는 경우 실제 메모리 상에 인스턴스가 없다는 것을 실행하는 과정에서 알아차리기 떄문에 문제가 된다.
		 */
		Parent parent2 = new Parent();
		Child child2 = (Child)parent2; // 런타임 오류 발생
		child2.childMethod();

		/**
		 * 정리하면, 업캐스팅은 생략이 가능하고 다운캐스팅은 생략이 불가능하다.
		 * 그럼 업캐스팅은 이러한 문제가 없다는 것으로 볼수 있다.
		 * 지금까지 상속관계의 흐름을 바라보면 자식 클래스의 인스턴스가 생성 될 때에는 부모 클래스의 인스턴스는 필수적으로 함께 생성이 된다.
		 * 또한 메소드를 찾기 위해서 부모 클래스를 찾아서 검색할 수가 있다.
		 * 이렇기 때문에 업캐스팅의 경우 인스턴스에 대해서 걱정없이 진행 할 수 있는 것이다.
		 * 다운 캐스팅의 경우에는 생성하는 클래스에 따라사 자식 클래스의 인스턴스가 있을 수도 있고 없을 수도 있기 때문에
		 * 실제 메모리 상의 데이터를 바라보지 않는 한 알 수가 없기에 위험하다.
		 */
	}
}
