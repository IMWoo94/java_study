package poly.basic;

public class CastingMain1 {
	public static void main(String[] args) {
		// 부모 변수가 자식 인스턴스 참조
		Parent poly = new Child();
		// 자식의 기능은 호출이 불가능하다.
		// poly.childMethod();

		// 다운캐스팅 ( 부모 타입 -> 자식 타입 )
		// 다운 캐스팅이 가능한 이유는 부모 타입의 변수의 실제 메모리 상에는 부모, 자식 클래스의 인스턴스가 생성되어 있기 때문에 가능하다.
		Child child = (Child)poly;
		child.childMethod();
		child.parentMethod();

	}
}
