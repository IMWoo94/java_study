package lang.immutable.address;

public class PrimitiveMain {
	public static void main(String[] args) {
		// 기본형은 값을 복사하기 때문에 각각의 변수는 별개로 사용이 된다.
		int a = 10;
		int b = a; // a 의 값을 가져와 b 에 복사후 대입
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		b = 20;
		System.out.println("20 -> b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
