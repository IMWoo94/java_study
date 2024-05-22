package poly.basic;

public class CastingMain3 {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent1 = child; // 자식 인스턴스를 부모 타입의 변수에 넣을 떄는 자동으로 업캐스팅이 이루어 집니다.
		Parent parent2 = (Parent)child;

		parent1.parentMethod();
		parent2.parentMethod();
		
	}
}
