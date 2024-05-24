package lang.string.immutable;

public class StringImmutable2 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1.concat(" java");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		/**
		 * String 클래스는 불변 객채로 설계되어 있다.
		 * 왜? 이는 앞서서 리터럴 형식의 문자열을 저장하는 공간인 문자열 상수 풀을 생각해보자.
		 * 우리가 참조형 타입을 사용할 때 문제가 되었던 부분은 어디서 해당 참조하는 주소를 알고 있다면
		 * 인스턴스의 값을 변경할 수 있고 이를 통해서 원치 않는 결과가 나올 수 있다.
		 * 이러한 문제는 실생활에서 단체 생활에서 공용 사용물건에 대해서는 발생할 수 밖에 없는 이슈
		 * 이런 문제를 방지하기 위해서 String 은 불변 객체로 설계되어 있다.
		 * 리터럴 문자열 상수 풀에 접근은 여러군데서 접근할 수 있으며, 이는 공유자원으로 사용되기 떄문
		 */
	}
}
