package operator;

public class Operator2 {
	public static void main(String[] args) {

		// java 에서는 문자열에도 + 연산자를 사용할 수 있다.

		// 문자열과 문자열 더하기1
		String result1 = "hello" + "world";
		System.out.println(result1);

		// 문자열과 문자열 더하기2
		String s1 = "string1";
		String s2 = "string2";
		String result2 = s1 + s2;
		System.out.println(result2);

		// 문자열과 숫자 더하기1
		String result3 = "a + b = " + 10;
		System.out.println(result3);

		// 문자열과 숫자 더하기2
		int num = 20;
		String str = "a + b =";
		String result4 = str + num;
		System.out.println(result4);

		// String 은 객체 타입으로 제공되는 클래스 입니다.
		/**
		 * String 을 들어가보면 final 이라느 예약어가 붙어 있는 것을 알 수 있다.
		 * class 에 final 이 붙어있으면 상속 및 변경이 불가능하다는 의미이다.
		 * immutable 한 성질을 가진다.
		 *
		 * 그렇다면 불변의 클래스를 + 연산을 진행하면 어떻게 진행이 되는 걸까?
		 * Java version 에 따라 따르게 동작한다.
		 *
		 * S
		 */

		// java 1.5 이전
		// String concat 메소드를 통한 신규 String 결과 리턴

		// java 8 이전
		// StringBuilder 를 통한 String 결과 리턴

		// java 8 이후
		// 동적 프로그래밍 방식 makeConcatWithConstants() 메소드
		// StringConcatFactory.class

	}
}
