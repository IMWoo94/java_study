package lang.string;

public class StringConcatMain {
	public static void main(String[] args) {
		String a = "hello";
		String b = "world";

		String result1 = a.concat(b);
		String result2 = a + b;
		// java 5 이전
		/**
		 * String result2 = a + b;
		 * String result2 = x001 + x002;
		 * String result2 = "hello".concat("world");
		 */
		// java 8 이전
		/**
		 * String result2 = a + b;
		 * StringBuilder sb = new StringBuilder(a);
		 * sb.append(b);
		 * String result2 = sb.toString();
		 */
		/**
		 * String concat 방식은 버전에 따라서 사용방법이 달라진다.
		 * 5버전 이전까지는 String concat 메소드를 통해서 하나씩 이어 붙이고 새로운 String 객체를 생성
		 * 이 과정에서 여러개의 단어를 + 할때마다 매번 객체가 생성되고 버려지는 메모리 적인 문제가 발생함
		 * 이를 개선하기 위해서 StringBuilder 객체를 통해서 Concat 을 진행하고 마지막 결과값을 String 객체로 리턴
		 * 이후 8버전 이후로는 invokeDynamic 방식으로 StringConcatFactory 를 통해서 동적으로 처리가 되도록 된다.
		 */

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}
