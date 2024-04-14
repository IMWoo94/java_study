package operator;

public class OperatorAdd2 {
	public static void main(String[] args) {
		// 전위, 후위 증감 연산자
		// 증감 연사자는 피연사자 앞에 두거나, 뒤에 둘 수 있습니다.
		// 연산자의 위치에 따라 연산이 수행되는 시점이 달라집니다.

		/**
		 * ++a : 전위(Prefix) 증감 연산자라 합니다.
		 * a++ : 후위(Postfix) 증감 연산자라 합니다.
		 */

		// 전위 증감 연산자 사용
		int a = 1;
		int b = 0;
		b = ++a;    // a의 값을 먼저 증가시키고, 그 결과를 b 에 대입
		System.out.println("a = " + a + ", b = " + b); // 결과 a = 2, b = 2

		// 후위 증감 연사자 사용
		a = 1;
		b = 0;
		b = a++; // a 의 증감 이전의 값 1 을 먼저 대입하고, 그 후 a 의 값을 증가
		System.out.println("a = " + a + ", b = " + b); // 결과 a = 2, b = 1

		// 증간 연사자를 단독으로 사용하는 경우 전위/후위 관계없이 증가가 된다.
		// 하지만 해당 값을 통해서 무언가 연산을 하는 작업 등이 있다면, 전위/후위에 따라 값이 달라질 수 있다.
	}
}
