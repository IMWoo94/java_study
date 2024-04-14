package operator;

import java.math.BigDecimal;

public class Operator1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;

		// +
		int sum = a + b;
		System.out.println("a + b = " + sum);
		/**
		 * int sum = a + b 계산 과정
		 *
		 * int sum = a + b // 1. 번수 값 읽기
		 * int sum = 5 + 2 // 2. 변수 값 계산
		 * int sum = 7	   // 3, 계산 결과를 sum 에 대입
		 * sum = 7		   // 최종 결과
		 */

		// -
		int diff = a - b;
		System.out.println("a - b = " + diff);

		// *
		int multi = a * b;
		System.out.println("a * b = " + multi);

		// /
		int div = a / b;
		System.out.println("a / b = " + div);
		/**
		 * 5/2 는 2.5가 되어야 하지만, 소수점이 제거된 2만 나오게 된다.
		 * 이는 자바에서 같은 int 형 계산하면 결과도 같은 int 형을 사용하게 된다.
		 * 그렇게 되면서 소수점 이하를 포함할 수 없다.
		 * 소수점을 표현하기 위해서는 형변환을 통해서 실수를 기반으로 작업해야 한다.
		 */
		// 나눗셈의 결과를 소수점으로 표현하기 위해서는 실수 형태로 결과를 받아야 한다.
		// 또한 나눗셈을 진행하는 피연산자의 값이 하나라도 실수형의 데이터 타입이 있어야 한다.
		double c = 2.0;
		double div2 = a / c;
		System.out.println("a / c = " + div2);

		// 주어진 타입이 모두 정수라면 캐스팅 ( 형변환 ) 을 통해서 변경 해주어도 된다.
		double div3 = (double)a / b;
		System.out.println("(double)a / b = " + div3);

		// / by zero
		// int byZeroExceptionDiv = a / 0;
		/**
		 * 나눗셈에서 분모는 0으로 나눌 수 없다.
		 * 진행하는 경우 Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * 예외가 발생한다.
		 */

		// %
		int mod = a % b;
		System.out.println("a % b = " + mod);

		/**
		 * 추가적으로 Java 에서 데이터 타입은 주어지 크기의 메모리를 통해서 값을 2진수로 가지게 된다.
		 * 그렇기 떄문에 정수형 int, long 타입의 경우 표현할 수 있는 값에 제한이 있다.
		 * 정수의 경우에도 long 이 표현할 수 있는 크기를 넘어서는 경우 표현하기 위해 BitInteger 라는 객체를 제공한다.
		 * 이는 Object type 으로 주어진 value 를 선언된 진수를 기반으로 데이터를 가지고 있게 된다.
		 *
		 * 이러한 점은 실수에서도 바라볼 수 있습니다.
		 * float, double 도 메모리에 대한 제한이 존재하며, 실수의 경우 무한 소수가 나오는 케이스가 있는 경우
		 * 자동 반올림 처리를 하게 됩니다.
		 * 아래의 사례를 보면 원하는 기대값이 아닌 다른 값이 나오게 되는 것을 볼 수 있다.
		 * 무한소수에 의해서 메모리 할당 크기의 한계 때문에 특정 자리수에서 반올림 표현을 문제가 된다.
		 * 물론 근사한 차이정도가 되겠지만, 금융 같은 오차가 있으면 안되는 작업에서는 문제가 될 수 있다.
		 * 소수를 표현하는 방식은 고정 소수점 방식/ 부동 소수점 방식 2가지가 있다.
		 *
		 * 고정 소수점 방식 - 실수 표현 메모리 크기, 소수 표현 메모리 크기를 고정적으로 나누어서 해당 크기만큼만 담아둔다.
		 * 고정 소수점을 사용하게 되면 표현할 수 있는 숫자의 크기가 줄어든다.
		 *
		 * 부동 소수점 방식 - 소수점의 위치를 담아두는 메모리 크기 ( 지수 ), 실제 실수 데이터 메모리 크리 ( 가수부 ) 로 나누어 표현한다.
		 * 부동 소수점을 통해 표현할 수 있는 크기가 늘어나면서 고정 소수점 보다 더 큰 수를 나타낼 수 있다.
		 *
		 * 하지만 결국 위 방식도 메모리 크기의 제한이 존재한다.
		 * 정수와 같시 실수도 BigDecimal 객체를 통해서 정확한 수를 나타낼 수 있다.
		 */
		double t1 = 12.23;
		double t2 = 34.45;
		// 기대값 : 46.68
		System.out.println(t1 + t2); // 46.68000000000001

		BigDecimal bigDecimal1 = new BigDecimal("12.23");
		BigDecimal bigDecimal2 = new BigDecimal("34.45");
		BigDecimal add = bigDecimal1.add(bigDecimal2);
		System.out.println(add);

	}
}
