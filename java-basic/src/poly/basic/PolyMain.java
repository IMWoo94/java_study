package poly.basic;

public class PolyMain {
	public static void main(String[] args) {
		// 부모 변수가 부모 인스턴스 참조
		/**
		 * parent 변수가 가지는 인스턴스 안에는 Parent 클래스의 인스턴스가 들어 있다.
		 * Parent 를 생성할 때 자식 클래스를 생성하지는 않는다.
		 * 상속의 관계에서 자식클래스가 생성될때 부모 클래스가 함께 생성이 된다.
		 */
		Parent parent = new Parent();
		parent.parentMethod();

		// 자식 변수가 자식 인스턴스 참조
		/**
		 * child 변수가 가지는 인스턴스 안에는 Child 클래스의 인스턴스와 Parent 클래스의 인스턴스를 가진다.
		 * 이는 Child 클래스가 Parent 클래스를 상속받았기 때문에 Child 생성 시 Parent 도 생성이 된다.
		 */
		Child child = new Child();
		child.childMethod();

		// 부모 변수가 자식 인스턴스 참조
		/**
		 * 부모 타입의 변수는 자식 인스턴스를 바로 참조할 수 있다.
		 * 이는 자식 클래스의 인스턴스를 생성할 때 자식,부모 클래스의 인스턴스를 각각 생성하고 참조할수 있도록 된다.
		 * 그렇기 때문에 부모 타입의 변수가 인스턴스로 생성되어 있기 때문에 가능하다.
		 */
		Parent poly = new Child();
		poly.parentMethod();

		/**
		 * 부모 타입의 변수가 자식 인스턴스를 품어서 생성하게 되면
		 * 메모리 상에는 부모, 자식 인스턴스가 만들어져 있다.
		 * 그렇다면 부모 변수여도 자식 인스턴스가 있으니 자식 메소드를 사용할 수 있지 않을까라고 생각이 들 수도 있다.
		 * 하지만, 이는 불가능하다 그 이유는 자바에서 상속관계의 메소드를 찾기 위해서는 자식 > 부모 위 단계로만 검색을 하게 된다.
		 * 즉, 부모가 자식에 있는 메소드를 찾으러 가지 않기 때문에 자식 클래스의 고유 메소드는 찾을 수 없기에 접근이 불가능하다.
		 */
		// poly.childMethod();

		// 자식 변수가 부모 인스턴스 참조 ( 불가능 )
		// Child poly2 = new Parent();
	}
}
