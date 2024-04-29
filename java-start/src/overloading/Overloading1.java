package overloading;

public class Overloading1 {
	/**
	 * 오버로딩
	 * 메소드 이름 + 매개변수 타입 ( 순서 ) = 메소드 시그니처
	 * 메소드 시그니처가 다르면 다른 메소드로 간주한다.
	 * 오버로딩의 경우 메소드 이름이 같고 매개변수 타입 ( 순서, 타입 갯수 가 변경이 되면 성립 )
	 */
	public static void main(String[] args) {
		System.out.println("1 :" + add(1, 2));
		System.out.println("2 :" + add(1, 2, 3));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	// 타입이 다른 경우 성립 X
	// public static double add(int a, int b, int c) {
	// 	return a + b + c;
	// }
}
