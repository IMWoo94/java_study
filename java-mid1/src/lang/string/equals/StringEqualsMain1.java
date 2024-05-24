package lang.string.equals;

public class StringEqualsMain1 {
	public static void main(String[] args) {
		// 생성자 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("new String() == 비교: " + (str1 == str2));
		System.out.println("new String() equals 비교: " + (str1.equals(str2)));

		// 리터럴 생성
		String str3 = "hello";
		String str4 = "hello";
		System.out.println("리터럴 == 비교: " + (str3 == str4));
		System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

		/**
		 * String 객체의 equals 메소드는 재정의 되어 저장되는 문자열이 동일하면 동등하다고 검증하도록 된다.
		 * 하지만 == 동일성 비교를 하는 경우 생성자 방식과 리터럴 방식의 차이가 나는 것을 알 수 있다.
		 *
		 * 자바에서 new 예약어를 통해서 클래스의 인스턴스를 생성하게 되면 heap 메모리 공간에 새로운 인스턴스가 생성이 된다.
		 * 그렇기 때문에 new 를 통한 생성은 같은 단어 일지라도 실제로 참조하는 메모리 주소값을 다르다
		 *
		 * 리터럴 생성의 경우 Java 에서 편리하게 쓸 수 있도록 해주는 거고, new 예약어를 붙여준다매!!!
		 * 이는 리터럴 형식으로 입력하게 되어도 결국에는 메모리에 대한 저장 공간을 부여해야한다
		 * 이런 공간적인 문제를 해결하기 위해서 동일한 단어에 대해서 어떠한 공간에 모아두고 동일하면 해당 정보를 가져다 쓸 수 있도록 한다.
		 * 이를 문자열 상수풀 이라고 한다.
		 */
	}
}
