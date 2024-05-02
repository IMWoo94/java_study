package ref;

public class NullMain2 {
	public static void main(String[] args) {
		Data data = null;
		data.value = 10; // NullPointerException 예외 발생
		/**
		 * 왜 예외가 발생할까? 왜 접근하지 못하는 걸까?
		 * 차례대로 보면 Data data = null; 아직 Data 클래스의 변수만 선언하고 인스턴스를 생성하지 않았다.
		 * 즉, 실제 메모리 어딘가에 인스턴스는 어디에도 없는 것
		 * 그렇기 때문에 접근할 실체가 없기도 하니 주소를 보고 찾아가야하는데 주소도 없고 실제도 없기 때문에 오류가 발생한다.
		 * data.value = 10 > null.value = 10 인데 null 이라는 메모리 주소가 잇지 않는한 주소를 알 수없다.
		 */
		System.out.println("data = " + data.value);

		// 그래도 지역변수에서 null 확인은 그나마 수월한 편이다.
	}
}
