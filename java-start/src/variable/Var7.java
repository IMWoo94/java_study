package variable;

public class Var7 {
	public static void main(String[] args) {
		// Java 에서 제공하는 데이터 타입

		/**
		 * primitive type ( 기본 타입 ) : byte, short, int, long, float, double, boolean, char
		 * reference type ( 참조 차임 ) : String, WrapperClass( primitive type 을 객체 처럼 감싼 객체 ), class ...
		 */
		/**
		 * 변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재합니다.
		 * 각 변수는 지정된 타입에 맞는 값을 사용해야 합니다.
		 */
		byte a = 123;            // 정수
		short b = 3341;            // 정수
		int c = 2000000;        // 정수
		long d = 200000000;        // 정수
		float e = 2.0f;            // 실수
		double f = 2L;            // 실수
		boolean g = true;        // true, false
		char h = 'a';            // 문자 하나
		String str = "hello";    // primitive type 은 아니지만 primitive type 처럼 선언해도 사용할 수 있는 특별한 케이스

		/**
		 * 위와 같이 변수에 고정된 값을 직접 적는 경우를 리터럴(literal) 이라고 한다.
		 */
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(str);
	}
}
