package operator;

public class Comp2 {
	public static void main(String[] args) {

		String str1 = "문자열1";
		String str2 = "문자열2";
		boolean result1 = "hello".equals("hello");     //리터럴 비교
		boolean result2 = str1.equals("문자열1");       //문자열 변수, 리터럴 비교
		boolean result3 = str1.equals(str2);          //문자열 변수 비교
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		// primitive type 에서 == != 비교 연산자를 사용하게 되면 값에 대해서 동일한지를 확인하게 됩니다.

		// 이러한 규칙은 reference type 에서는 원하는 결과와 다르게 동작할 수 있습니다.
		/**
		 * 기본적으로 java 에서 값이 같은지 다른지를 확인하기 위해서 2가지 방법이 있습니다.
		 * ==, != 비교 연산자, equals 메소드 2가지가 있습니다.
		 *
		 * equals 메소드는 클래스의 모든 부모인 object 에 구현되어 있으며, 별도의 메소드 재정의를 하지 않으면 object 메소드의 equals 로 == != 비교 연산을 하게 된다.
		 * 여기서 동등성, 동일성이라는 개념이 나오게 되는데
		 * 동일성은 실제로도 객체 자체, 객체 안의 내용물 같은 것이라고 본다.
		 * 동등성은 실제 객체는 다를 수 있지만 객체 안의 내용이 같은 경우 동등하다고 볼 수 있습니다.
		 * 비교 연산자는 동일성에 대해서 판단을 한다.
		 * Object 의 equals 메소드는 기본적으로는 비교 연산으로 동일성을 판단하게 됩니다.
		 * 대체적으로 객체에서 동일성을 판단하는 것은 무리가 있습니다. 그렇기 때문에 동등성 내용물을 기반으로 같은지 확인하게 됩니다.
		 * 재정의를 통해서 동등성 내용물이 같다고 볼 수 있도록 해야 합니다.
		 *
		 * 동일하면 동등하다가 성립됩니다. 다만, 동등하다고 해서 동일성이 성립하지는 않습니다.
		 *
		 * 만약 equals 를 재정의 하면 hashCode 라는 메소드도 꼭 같이 정의하여 동일한 필드로 값을 확인하도록 해야 합니다.
		 * 이는 앞에서 hash 와 관련 자료구조에 사용되는 개념으로 추후 설명
		 */

	}
}
